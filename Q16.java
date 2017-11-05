
public class Q16 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] twentyCol = new int[4][5];
		System.out.println("행을 우선으로 한 행렬");
		int n = 1;
		for(int i =0; i<twentyCol.length;i++){
			for(int j = 0;j<twentyCol[i].length;j++){
				twentyCol[i][j] = n;
				n++;
				System.out.print("[" + (i+1) + "][" + (j+1) + "] : " + twentyCol[i][j]+" ");
				if(j == twentyCol[i].length-1){
					System.out.println();
				}
			}
		}
		System.out.println();
		
		int[][] twentyRow = new int[4][5];
		System.out.println("열을 우선으로 한 행렬");
		int m = 1;
		for(int i =0; i<twentyRow[0].length;i++){
			for(int j = 0;j<twentyRow.length;j++){
				twentyRow[j][i] += m;
				m++;
				System.out.print("[" + (j+1) + "][" + (i+1) + "] : " + twentyRow[j][i]+" ");
				System.out.println();
			}
		}

	}

}
