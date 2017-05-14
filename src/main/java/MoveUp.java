package main.java;

public class MoveUp implements MoveCommand {
	Player player = null;
	Map map = null;
	@Override
	public void doMove(Player p, Map m) {
		this.player = p;
		this.map = m;
		if (this.map.getMap(this.player.getY() - 1, this.player.getX()) != 1) {
			this.player.move(0, -1);
		}
	}
}
