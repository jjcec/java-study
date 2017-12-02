

public class MemberTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Member mem = new Member("차은채", 19);
		
		mem.setIdAndPassword("a", "1234");
		
		if(mem.login("a", "43243") == true){
			System.out.println("로그인 되었습니다.");
		}
		else System.out.println("틀린 아이디나 비밀번호입니다.");
		
		mem.logout();

	}

}

//String s = "abc";
//String b = "abc";
//String c = new String("abc"); 와 다르다.