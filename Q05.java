
public class Q05 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        char symbol = (char)(Math.random()*128);
        
        if(Character.isUpperCase(symbol)){
             System.out.println("영어 대문자 입니다");
        }
        else if (Character.isLowerCase(symbol)){
        	System.out.println("영어 소문자 입니다");
        }
        else{
        	System.out.println("영어 알파벳 이외의 문자 입니다");
        }
	}

}
