package main.java;

public class PlayerAction {
	Player player;
	Map map;
	ItemMap itemMap;
	Inventory inventory;

	public PlayerAction(Game game) {
		this.player = game.player;
		this.map = game.map;
		this.itemMap = game.itemMap;
		this.inventory = game.inventory;
	}

	public void move(MoveCommand command) {  //Command pattern
		command.doMove(this.player, this.map);
	}

	public void pickUpItem() {
		int xp = this.player.getX();
		int yp = this.player.getY();
		if (this.itemMap.getItemMap(yp, xp) != 0) {
			if (this.inventory.isFull() == false) {
				int ItemID = this.itemMap.getItemMap(yp, xp);
				this.inventory.add(ItemID);
				this.itemMap.ItemMapDesign[yp][xp] = 0;
			}
		}
	}

	public void fight() {
	}

	public void openInventory() {
		this.inventory.ausgabe();
	}
}
