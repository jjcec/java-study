//5��
public class Book {
	private String title;
	private boolean inPlace = true;
	
	Book(String title){
		this.title = title;
	}
	
	boolean isInPlace(){
		if(this.inPlace == true){   //�ڸ��� ������ true
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
		if(this.inPlace == false){   //�ڸ��� ������ �������ٴ°Ŵϱ�
			System.out.println(this.getTitle() + " is already rented");
		}
		else{
			this.inPlace = false;
			System.out.println("You rented " + this.getTitle());
		}
	}
	
	void handIn(){
		if(this.inPlace == false){   //�ݳ�
			this.inPlace = true;  //�ڸ��� ������ �ݳ��ϰ� �ݳ�Ȯ��
			System.out.println("Thank you for returning " + this.getTitle());
		}
		else{
			System.out.println(this.getTitle() + " is not rented yet(you cannot return it)");
		}
	}
}
