package command;
import main.java.Map;
import main.java.Player;

public interface MoveCommand {
	void doMove(Player p, Map m);
}
