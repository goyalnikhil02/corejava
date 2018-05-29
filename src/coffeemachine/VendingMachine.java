package coffeemachine;

import java.util.List;

public interface VendingMachine {
	 public long returnPrice(Item item);
	    public void insertCoin(Coin coin);
	    public List<Coin> refund();
	    public Bucket<Item, List<Coin>> returnChange();   
	    public void reset();

}
