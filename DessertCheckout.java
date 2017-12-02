
public class DessertCheckout {
	private DessertItem[] dessertItems;
	
	DessertCheckout(int maxitems){
		dessertItems = new DessertItem[maxitems];
		for(int i = 0; i<dessertItems.length; i++){
			dessertItems[i] = null;
		}
	}
	
	public boolean enterItem(DessertItem item){
		for(int i = 0; i<dessertItems.length; i++){
			if(dessertItems[i] == null){
				dessertItems[i] = item;
				return true;
			}
		}
		return false;
	}
	
	public int getTotalNumberOfItems(){
		int num = 0;
		for(int i = 0; i<dessertItems.length; i++){
			if(dessertItems[i] != null){
				num += 1;
			}
		}
		return num;
	}
	
	public int getTotalCost(){
		int sum = 0;
		for(int i =0; i<dessertItems.length;i++){
			if(dessertItems[i] != null){
				sum += dessertItems[i].getCost();
			}
			else{
				break;
			}
		}
		return sum;
	}
	
	public void clearItems(){
		for(int i =0; i<dessertItems.length; i++){
			dessertItems[i] = null;
		}
	}

}
