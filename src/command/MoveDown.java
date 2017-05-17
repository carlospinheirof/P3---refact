package command;

import main.java.Map;
import main.java.Player;

public class MoveDown implements MoveCommand {
	
	@Override
	public void doMove(Player p, Map m) {
		p.downstate = p.downstate.toDown(p, m);
	}
}
