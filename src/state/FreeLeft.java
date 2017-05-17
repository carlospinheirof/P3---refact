package state;

import main.java.Map;
import main.java.Player;

public class FreeLeft implements LeftState {
	Player player = null;
	Map map = null;
	@Override
	public LeftState toLeft(Player p, Map m) {
		this.player = p;
		this.map = m;
		if (this.map.getMap(this.player.getY(), this.player.getX() - 1) != 1) {
			this.player.move(-1, 0);
			//checks
			this.player.downstate = this.player.downstate.check(player, map);
			this.player.rightstate = this.player.rightstate.check(player, map);
			this.player.upstate = this.player.upstate.check(player, map);
			return this;
		}
		else{
			//checks
			this.player.downstate = this.player.downstate.check(player, map);
			this.player.rightstate = this.player.rightstate.check(player, map);
			this.player.upstate = this.player.upstate.check(player, map);
			return new BlockLeft();
		}
	}

	@Override
	public LeftState check(Player p, Map m) {
		this.player = p;
		this.map = m;
		if (this.map.getMap(this.player.getY(), this.player.getX() - 1) != 1) {
			return this;
		}
		else{
			return new BlockLeft();
		}
	}

}
