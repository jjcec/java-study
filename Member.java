
public class Member {
	//2��
	String name;
	String id;
	String password;
	int age;
	
	//3��
	public Member(String name, int age){
		this.name = name;
		this.age = age;
	}
	
	public void setIdAndPassword(String id, String password){
		this.id = id;
		this.password = password;
	}
	
	//4��
	boolean login(String id, String password){
		if (this.id.equals(id) && this.password.equals(password)){
			//�����ϱ� if(this.id == id && this.password == password)�� �ص� �� �´°��ΰ���?
			return true;
		} else {
			return false;
		}
		
	}
	
	void logout(){
		System.out.println("�α� �ƿ��Ǿ����ϴ�.");
	}
}
