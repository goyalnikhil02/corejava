package coffeemachine;

import java.util.HashMap;
import java.util.Map;

public class Inventory<T> {
	private Map<T, Integer> inventory = new HashMap<T, Integer>();

	public int getQuantity(T item) {
		Integer value = inventory.get(item);
		return value == null ? 0 : value;
	}

	// add the count of the item,if add is called
	public void add(T item) {
		inventory.put(item, inventory.get(item) + 1);
	}

	// reduce the count of the item,if method is called
	public void deduct(T item) {
		if (inventory.get(item) >= 0) {
			inventory.put(item, inventory.get(item) - 1);
		}
	}

	public void put(T item, int quantity) {
		inventory.put(item, quantity);
	}

	public void clear() {
		inventory.clear();
	}

}
