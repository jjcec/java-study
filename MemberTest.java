

public class MemberTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Member mem = new Member("����ä", 19);
		
		mem.setIdAndPassword("a", "1234");
		
		if(mem.login("a", "43243") == true){
			System.out.println("�α��� �Ǿ����ϴ�.");
		}
		else System.out.println("Ʋ�� ���̵� ��й�ȣ�Դϴ�.");
		
		mem.logout();

	}

}

//String s = "abc";
//String b = "abc";
//String c = new String("abc"); �� �ٸ���.