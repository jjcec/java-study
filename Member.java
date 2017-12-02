
public class Member {
	//2번
	String name;
	String id;
	String password;
	int age;
	
	//3번
	public Member(String name, int age){
		this.name = name;
		this.age = age;
	}
	
	public void setIdAndPassword(String id, String password){
		this.id = id;
		this.password = password;
	}
	
	//4번
	boolean login(String id, String password){
		if (this.id.equals(id) && this.password.equals(password)){
			//질문하기 if(this.id == id && this.password == password)로 해도 왜 맞는것인가요?
			return true;
		} else {
			return false;
		}
		
	}
	
	void logout(){
		System.out.println("로그 아웃되었습니다.");
	}
}
