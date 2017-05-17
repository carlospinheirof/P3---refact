package visitor;

import main.java.InventoryItem;

public class GetSizeInvVisitor implements InventoryVisitor {

	@Override
	public void toVisit(InventoryItem item) {
		int i = 0;
		while(item != null){
			item = item.next;
			i++;
		}
		if(i == 0){
			System.out.println("It's empty.");
		}else if(i == 1){
			System.out.println("There is a item.");
		}else{
			System.out.printf("There are %d.\n", i);
		}
	}
}
