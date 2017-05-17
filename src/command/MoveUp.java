package command;

import main.java.Map;
import main.java.Player;

public class MoveUp implements MoveCommand {
	@Override
	public void doMove(Player p, Map m) {
		p.upstate = p.upstate.toUp(p, m);
	}
}
