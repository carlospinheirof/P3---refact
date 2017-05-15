package main.java;

public class FreeRight implements RightState {
	Player player = null;
	Map map = null;
	@Override
	public RightState toRight(Player p, Map m) {
		this.player = p;
		this.map = m;
		if (this.map.getMap(this.player.getY(), this.player.getX() + 1) != 1) {
			this.player.move(1, 0);
			//check
			this.player.upstate = this.player.upstate.check(player, map);
			this.player.downstate = this.player.downstate.check(player, map);
			this.player.leftstate = this.player.leftstate.check(player, map);
			return this;
		}
		else{
			//check
			this.player.upstate = this.player.upstate.check(player, map);
			this.player.downstate = this.player.downstate.check(player, map);
			this.player.leftstate = this.player.leftstate.check(player, map);
			return new BlockRight();
		}
	}

	@Override
	public RightState check(Player p, Map m) {
		this.player = p;
		this.map = m;
		if (this.map.getMap(this.player.getY(), this.player.getX() + 1) != 1) {
			return this;
		}
		else{
			return new BlockRight();
		}
	}

}
