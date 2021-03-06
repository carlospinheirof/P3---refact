package main.java;

import visitor.InventoryVisitor;

public class Inventory {

	InventoryItem start, ende;
	int size, maxSize;

	public Inventory() {
		this.size = 0;
		this.maxSize = 5;
	}
	public void acceptVisitor(InventoryVisitor visitor){
		visitor.toVisit(start);
	}

	public void add(int ItemID) {

		if (this.size == this.maxSize) {
			return;
		}

		InventoryItem item = new InventoryItem(ItemID);
		if (this.start == null) {
			this.start = item;
			this.ende = this.start;
		} else {
			this.ende.next = item;
			this.ende.next.previous = this.ende;
			this.ende = this.ende.next;
		}
		this.size++;
	}

	public void remove() {
		// to do
		this.size--;
	}

	public int getSize() {
		return this.size;
	}

	public boolean isFull() {
		if (this.size == this.maxSize) {
			return true;
		} else {
			return false;
		}

	}
}
