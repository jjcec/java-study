public class Q01_02_03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Q01
		int[] scores = {90,85,100,70,95};
		
		System.out.println("Q1 결과값");
		System.out.println("scores[0]: " + scores[0]);
		System.out.println("scores[1]: " + scores[1]);
		System.out.println("scores[2]: " + scores[2]);
		System.out.println("scores[3]: " + scores[3]);
		System.out.println("scores[4]: " + scores[4]);
		System.out.println(" ");
		
		//Q02
		int max= scores[0];
		int min=scores[0];
		for(int i=1;i<scores.length;i++){
			if(scores[i]>max)
				max = scores[i];
			else if(scores[i]<min)
				min = scores[i];
		}
		System.out.println("Q2 결과값");
		System.out.println("max: " +max);
		System.out.println("min: " +min);
		System.out.println(" ");
		
		//Q03
		int sum=0;
		for(int s : scores){
			sum += s;
		}
		System.out.println("Q3 결과값");
		System.out.println("총합: " + sum);
		double average = (double)sum/scores.length;
		System.out.println("평균값: " + average);

	}

}
