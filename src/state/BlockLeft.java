package state;

import main.java.Map;
import main.java.Player;

public class BlockLeft implements LeftState {
	Player player = null;
	Map map = null;
	@Override
	public LeftState toLeft(Player p, Map m) {
		return this;
	}

	@Override
	public LeftState check(Player p, Map m) {
		this.player = p;
		this.map = m;
		if (this.map.getMap(this.player.getY(), this.player.getX() - 1) != 1) {
			return new FreeLeft();
		}
		else{
			return this;
		}
	}

}
