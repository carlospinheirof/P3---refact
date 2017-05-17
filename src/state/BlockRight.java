package state;

import main.java.Map;
import main.java.Player;

public class BlockRight implements RightState {

	@Override
	public RightState toRight(Player p, Map m) {
		return this;
	}

	@Override
	public RightState check(Player p, Map m) {
		
		if (m.getMap(p.getY(), p.getX() + 1) != 1) {
			return new FreeRight();
		}
		else{
			return this;
		}
	}

}
