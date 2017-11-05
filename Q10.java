
public class Q10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        int number = 345713046;
        while(number>0){
        	System.out.print(number%10);
        	number /= 10;
        }
	}

}
/*
   int input = 0;
   
   while(input!=0){
   input = input*10 + (input%10);
   input/=10:
   }
*/