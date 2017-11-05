
public class Q07_08 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Q07

		String[] splitOutput = new String[3];
		String input = "Object Oriented Programming,Open Source Software Programming,BigData Analysis";
		splitOutput[0]="Object Oriented Programming";
		splitOutput[1]="Open Source Software Programming";
		splitOutput[2]="BigData Analysis";
		
		/*
		String splitOutput = new Stirng[3];
		String splitOutput = "Object Oriented Programming,Open Source Software Programming,BigData Analysis";
		String[] ids = splitOutput.split(",");
		for(String id : ids){
			System.out.println(id);
		}
		*/
		
		//Q08
		System.out.println("각 원소의 값이 “Object Oriented Programming” 이라는 값과 일치하는가");
		for(int i =0; i<splitOutput.length;i++){
			if(splitOutput[i] == "Object Oriented Programming"){
				System.out.println("일치");
			}
			else
				System.out.println("불일치");
		}
		System.out.println(" ");
		//
		System.out.println("각 String 원소의 문자열 길이");
		for(int i =0; i<splitOutput.length;i++){
			
			System.out.println(splitOutput[i].length());
		}
		System.out.println(" ");
		//
		System.out.println("“Programming” 이라는 문자열이 시작하는 위치의 인덱스");
		for(int i = 0;i<splitOutput.length;i++){
			int index0fProgram = splitOutput[i].indexOf("Programming");
	        System.out.println(index0fProgram);
		}
	}

}
