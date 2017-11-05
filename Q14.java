
public class Q14 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] threeFourArr = {{85, 80,70,90},{70,100,90,60},{100,100, 80,75}};
		int sum = 0;
		for(int i=0;i<threeFourArr.length; i++){
        	for(int j =0; j<threeFourArr[i].length; j++){
        		sum += threeFourArr[i][j];
        	}
        	double average  = (double)sum/threeFourArr[i].length;
        	System.out.println(i+1 +"ÇàÀÇ Æò±Õ°ª: " + average);
        	sum = 0;
        }
		//
		for(int i=0;i<threeFourArr[0].length; i++){
        	for(int j =0; j<threeFourArr.length; j++){
        		sum += threeFourArr[j][i];
        	}
        	double average  = (double)sum/threeFourArr.length;
        	System.out.println(i+1 +"¿­ÀÇ Æò±Õ°ª: " + average);
        	sum = 0;
        }
	}

}
