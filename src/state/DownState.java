package state;

import main.java.Map;
import main.java.Player;

public interface DownState {
	DownState toDown(Player p, Map m);
	DownState check(Player p, Map m);
}
