
public class Espresso extends DessertItem{
	private int numberOfShots;
	final int SINGLE_SHOT_PRICE = 1000;
	
	Espresso(String name, int numberOfShots){
		super(name);
		this.numberOfShots = numberOfShots;
	}
    public int getCost(){
    	return numberOfShots*SINGLE_SHOT_PRICE;
    }
}
