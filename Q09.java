
public class Q09 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        //int num = (int) (Math.random()*6)+1;
        int sum1 = 0;
        int sum2 = 0;
        int sum3 = 0;
        int sum4 = 0;
        int sum5 = 0;
        int sum6 = 0;
        
        for(int i =0;i<10000;i++){
        	int num = (int) (Math.random()*6)+1;
            if(num == 1){
            	sum1 += 1;
            }
            else if(num == 2){
            	sum2 += 1;
            }
            else if(num == 3){
            	sum3 += 1;
            }
            else if(num == 4){
            	sum4 += 1;
            }
            else if(num == 5){
            	sum5 += 1;
            }
            else{
            	sum6 += 1;
            }
	    }
        System.out.println("sum1 = " + sum1);
        System.out.println("sum2 = " + sum2);
        System.out.println("sum3 = " + sum3);
        System.out.println("sum4 = " + sum4);
        System.out.println("sum5 = " + sum5);
        System.out.println("sum6 = " + sum6);
	}

}
