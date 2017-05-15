package main.java;

public class FreeUp implements UpState {
	Player player = null;
	Map map = null;
	@Override
	public UpState check(Player p, Map m){
		this.player = p;
		this.map = m;
		if (this.map.getMap(this.player.getY() - 1, this.player.getX()) != 1) {
			return this;
		}
		else{
			return new BlockUp();
		}
	}
	@Override
	public UpState toUp(Player p, Map m) {
		this.player = p;
		this.map = m;
		if (this.map.getMap(this.player.getY() - 1, this.player.getX()) != 1) {
			this.player.move(0, -1);
			//checks
			this.player.downstate = this.player.downstate.check(player, map);
			this.player.rightstate = this.player.rightstate.check(player, map);
			this.player.leftstate = this.player.leftstate.check(player, map);
			return this;
		}
		else{
			//checks
			this.player.downstate = this.player.downstate.check(player, map);
			this.player.rightstate = this.player.rightstate.check(player, map);
			this.player.leftstate = this.player.leftstate.check(player, map);
			return new BlockUp();
		}
	}
}
