package main.java;

public class BlockDown implements DownState {

	Player player = null;
	Map map = null;
	@Override
	public DownState toDown(Player p, Map m) {
		return this;
	}

	@Override
	public DownState check(Player p, Map m) {
		this.player = p;
		this.map = m;
		if (this.map.getMap(this.player.getY() + 1, this.player.getX()) != 1) {
			return new FreeDown();
		}
		else{
			return this;
		}
	}

}
