package main.java;

public class MoveLeft implements MoveCommand {
	
	@Override
	public void doMove(Player p, Map m) {
		p.leftstate = p.leftstate.toLeft(p, m);
	}

}
