
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
		System.out.println("�� ������ ���� ��Object Oriented Programming�� �̶�� ���� ��ġ�ϴ°�");
		for(int i =0; i<splitOutput.length;i++){
			if(splitOutput[i] == "Object Oriented Programming"){
				System.out.println("��ġ");
			}
			else
				System.out.println("����ġ");
		}
		System.out.println(" ");
		//
		System.out.println("�� String ������ ���ڿ� ����");
		for(int i =0; i<splitOutput.length;i++){
			
			System.out.println(splitOutput[i].length());
		}
		System.out.println(" ");
		//
		System.out.println("��Programming�� �̶�� ���ڿ��� �����ϴ� ��ġ�� �ε���");
		for(int i = 0;i<splitOutput.length;i++){
			int index0fProgram = splitOutput[i].indexOf("Programming");
	        System.out.println(index0fProgram);
		}
	}

}
