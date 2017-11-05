
public class Q04_05_06 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Q04
		int[] arr4 = new int[10];
		for (int i=0; i < arr4.length ; i++ ) { 
           arr4[i] = i;
		}
        /*
		arr4[0]=0;
		arr4[1]=1;
		arr4[2]=2;
		arr4[3]=3;
		arr4[4]=4;
		arr4[5]=5;
		arr4[6]=6;
		arr4[7]=7;
		arr4[8]=8;
		arr4[9]=9;
		*/
		System.out.println("Q4 결과값");
		for (int i =0;i<arr4.length;i++){
        	System.out.println("arr4[" + i + "] : " + arr4[i]);
        }
		System.out.println("");
		
		//Q05
		System.out.println("Q5 결과값");
		for(int i =0;i<arr4.length;i++){
			arr4[i] = (int) (Math.random()*10);
			System.out.println("arr4[" + i + "] : " + arr4[i]);
		}
		System.out.println("");
		
		//Q06
		System.out.println("Q6 결과값");
		int arr6[] = new int[100];
		for(int i =0;i<arr6.length;i++){
			arr6[i] = (int) (Math.random()*10+1);
		}
		
		int num_arr6[] = new int[10];
		for(int i =0;i<arr6.length;i++){
			num_arr6[arr6[i]-1]++;
		}
		for (int i=0; i < num_arr6.length ; i++ ) { 
            System.out.println( i+1 +"의 개수 :"+ num_arr6[i]); 
      } 
		
	}

}
