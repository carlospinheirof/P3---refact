package main.java;

public class InventoryItem {

	public InventoryItem next, previous;
	public int ItemID;

	public InventoryItem(int ItemID) {
		this.ItemID = ItemID;
	}

}
