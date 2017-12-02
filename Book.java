//5번
public class Book {
	private String title;
	private boolean inPlace = true;
	
	Book(String title){
		this.title = title;
	}
	
	boolean isInPlace(){
		if(this.inPlace == true){   //자리에 있으면 true
			return true;
		}
		else{
			return false;
		}
	}
	
	String getTitle(){
		return this.title;
	}
	
	void rent(){
		if(this.inPlace == false){   //자리에 없으면 빌려갔다는거니까
			System.out.println(this.getTitle() + " is already rented");
		}
		else{
			this.inPlace = false;
			System.out.println("You rented " + this.getTitle());
		}
	}
	
	void handIn(){
		if(this.inPlace == false){   //반납
			this.inPlace = true;  //자리에 없으면 반납하고 반납확인
			System.out.println("Thank you for returning " + this.getTitle());
		}
		else{
			System.out.println(this.getTitle() + " is not rented yet(you cannot return it)");
		}
	}
}
