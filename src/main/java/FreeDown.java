package main.java;

public class FreeDown implements DownState {
	Player player = null;
	Map map = null;
	@Override
	public DownState toDown(Player p, Map m) {
		this.player = p;
		this.map = m;
		if (this.map.getMap(this.player.getY() + 1, this.player.getX()) != 1) {
			this.player.move(0, 1);
			//check
			this.player.upstate = this.player.upstate.check(player, map);
			this.player.rightstate = this.player.rightstate.check(player, map);
			this.player.leftstate = this.player.leftstate.check(player, map);
			return this;
		}
		else{
			//check
			this.player.upstate = this.player.upstate.check(player, map);
			this.player.rightstate = this.player.rightstate.check(player, map);
			this.player.leftstate = this.player.leftstate.check(player, map);
			return new BlockDown();
		}
	}

	@Override
	public DownState check(Player p, Map m) {
		this.player = p;
		this.map = m;
		if (this.map.getMap(this.player.getY() + 1, this.player.getX()) != 1) {
			return this;
		}
		else{
			return new BlockDown();
		}
	}

}
