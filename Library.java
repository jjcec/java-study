//6번
public class Library {
	String name;
	static String hour = "9 AM to 5PM";

	Book[] books = new Book[10];
	//private Book[] books;
	
	public Library(){
		this("defaultName");
	}
	
	Library(String name){
		this.name = name;
		//books = new Book[10];
		for (int i =0; i < 10; i++){   //null값으로 배열 초기화
			books[i] = null;
		}
	}
	

	public void addBook(Book book){
		for(int i=0; i<10; i++){       //10 > books.length
			if(books[i] == null){      //배열값이 null인것을 확인하고 책 넣기
				books[i] = book;
				break;
			}
		}
	}
	
	public String getName(){
		return this.name;
	}
	
	public void printAllBooks(){
		for(int i =0; i < 10; i++){
			if(books[i] != null){     //nullpointerexception 해결하기 위해 null인지 먼저 확인
				System.out.println(books[i].getTitle() + " in " + this.name);
			}
			else{
				break;
			}
		}
	}
	public void printAllRentedBooks(){
		for(int i = 0; i< 10; i++){
			if(this.books[i] == null){
				break;
			}
			else if(this.books[i].isInPlace() == false){  //!= null을 &&로 묶어서 한번에 써주도 됨
				System.out.println(this.books[i].getTitle() + " is rented in " + this.name);
			}
		}
	}
	public boolean rentBook(String book){
		for(int i = 0; i<10;i++){
		    if(this.books[i].isInPlace() == true){   //if(books[i] != null && books[i].getTitle().equals(title) && book..?
		    	if (this.books[i].getTitle() == book)
		    	{
			    	books[i].rent();
			    	return true;
		    	}
		     }
		    else break;
	    }
		return false;
	}
	
	public boolean handInBook(String book){
		for(int i = 0; i<10;i++){
			if(this.books[i] == null){
				break;
			}
			else if(this.books[i].isInPlace() == false){
			    books[i].handIn();
			    return true;

		     }
	    }
		return false;
	}
}
