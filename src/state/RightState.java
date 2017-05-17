package state;

import main.java.Map;
import main.java.Player;

public interface RightState {
	RightState toRight(Player p, Map m);
	RightState check(Player p, Map m);
}
