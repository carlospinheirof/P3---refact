package main.java;

public class MoveLeft implements MoveCommand {
	Player player = null;
	Map map = null;
	@Override
	public void doMove(Player p, Map m) {
		this.player = p;
		this.map = m;
		if (this.map.getMap(this.player.getY(), this.player.getX() - 1) != 1) {
			this.player.move(-1, 0);
		}
	}

}
