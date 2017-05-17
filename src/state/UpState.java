package state;

import main.java.Map;
import main.java.Player;

public interface UpState {
	UpState toUp(Player p, Map m);
	UpState check(Player p, Map m);
}
