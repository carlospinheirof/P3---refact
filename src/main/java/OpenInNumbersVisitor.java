package main.java;

public class OpenInNumbersVisitor implements InventoryVisitor {

	@Override
	public void toVisit(InventoryItem item) {	
		System.out.println("Inventory:");
		if(item == null){
			System.out.println("Empty!");
		}
		while (item != null) {
			System.out.println(item.ItemID);
			if(item.next == null){
				System.out.println("**********");
			}
			item = item.next;
		}
	}
}
