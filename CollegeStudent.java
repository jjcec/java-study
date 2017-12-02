
public class CollegeStudent extends Student{
	String major;
	
	CollegeStudent(String studentId, double grade, String major){
		super(studentId, grade);
		this.major = major;
	}
	
	public String toString(){
		return super.toString() + " major: " + major;
	}

}
