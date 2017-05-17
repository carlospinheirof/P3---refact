package visitor;

import main.java.InventoryItem;

public interface InventoryVisitor {
		void toVisit(InventoryItem item);
}
