
public class Cookie extends DessertItem{
	private int numberOfItems;
	private int pricePerItem;
	
	Cookie(String name, int numberOfItems, int pricePerItem){
		super(name);
		this.numberOfItems = numberOfItems;
		this.pricePerItem = pricePerItem;
	}
    public int getCost(){
    	return numberOfItems*pricePerItem;
    }
}
