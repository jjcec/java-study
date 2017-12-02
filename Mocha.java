
public class Mocha extends Espresso{
	private int weightOfChocolate;
	private int weightOfMilk;
	
	final int CHOCOLATE_PRICE_PER_GRAM = 100;
	final int MILK_PRICE_PER_GRAM = 50;
	
	Mocha(String name, int numberOfShots, int weightOfChocolate, int weightOfMilk){
		super(name,numberOfShots);
		this.weightOfChocolate = weightOfChocolate;
		this.weightOfMilk = weightOfMilk;
	}
    
	public int getCost(){
		return super.getCost() + weightOfChocolate * CHOCOLATE_PRICE_PER_GRAM + weightOfMilk * MILK_PRICE_PER_GRAM;
	}
}
