package coffeemachine;

import java.util.List;

public class VendingMachineImpl implements VendingMachine{
	
	static Inventory<Coin> cashInventory=new Inventory<Coin>();
	Inventory<Item> itemInventory=new Inventory<Item>();
	 private Item currentItem;
	 private long currentBalance;

	 
	 public VendingMachineImpl()
	 {
		// fill some coins and item initially
		 cashInventory.put(Coin.PENNY,5);
		 cashInventory.put(Coin.NICKLE,5);
		 cashInventory.put(Coin.DIME,5);
		 cashInventory.put(Coin.QUARTER,5);
		 
		 
		 itemInventory.put(Item.COKE,5);
		 itemInventory.put(Item.PEPSI,5);
		 itemInventory.put(Item.SODA,5);
		 
		
	 }
	 
	@Override
	public long returnPrice(Item item) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public void insertCoin(Coin coin) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public List<Coin> refund() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Bucket<Item, List<Coin>> returnChange() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void reset() {
		// TODO Auto-generated method stub
		
	}

	
}
