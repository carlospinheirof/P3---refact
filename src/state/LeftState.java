package state;

import main.java.Map;
import main.java.Player;

public interface LeftState {
	LeftState toLeft(Player p, Map m);
	LeftState check(Player p, Map m);
}
