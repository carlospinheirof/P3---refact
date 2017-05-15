package main.java;

public class MoveRight implements MoveCommand {

	@Override
	public void doMove(Player p, Map m) {
		p.rightstate = p.rightstate.toRight(p, m);
	}
}
