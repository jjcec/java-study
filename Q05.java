
public class Q05 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        char symbol = (char)(Math.random()*128);
        
        if(Character.isUpperCase(symbol)){
             System.out.println("���� �빮�� �Դϴ�");
        }
        else if (Character.isLowerCase(symbol)){
        	System.out.println("���� �ҹ��� �Դϴ�");
        }
        else{
        	System.out.println("���� ���ĺ� �̿��� ���� �Դϴ�");
        }
	}

}
