package main.java;

public class OpenInNamesVisitor implements InventoryVisitor {

	@Override
	public void toVisit(InventoryItem item) {
		System.out.println("Inventory:");
		if(item == null){
			System.out.println("Empty!");
		}
		while (item != null) {
			if(item.ItemID == 1){
				System.out.println("Knife.");
			}else if(item.ItemID == 2){
				System.out.println("Bottom of life.");
			}
			if(item.next == null){
				System.out.println("**********");
			}
			item = item.next;
		}
	}

}
