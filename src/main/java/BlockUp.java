package main.java;

public class BlockUp implements UpState {
	Player player = null;
	Map map = null;
	@Override
	public UpState toUp(Player p, Map m) {
		return this;
	}
	public UpState check(Player p, Map m){
		this.player = p;
		this.map = m;
		if (this.map.getMap(this.player.getY() - 1, this.player.getX()) != 1) {
			return new FreeUp();
		}
		else{
			return this;
		}
	}
}
