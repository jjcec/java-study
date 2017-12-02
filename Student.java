
public class Student {
	private String studentId;
	private double grade;
	
	public String getStudentId(){
		return this.studentId;
	}
	public double getGrade(){
		return this.grade;
	}
	
	public void setStudentId(String studentId){
		this.studentId = studentId;
	}
	public void setGrade(double grade){
		this.grade = grade;
	}
	
	Student(String studentId){
		this(studentId, 0);
	}
	
	Student(String studentId, double grade){
		setStudentId(studentId);
		setGrade(grade);
	}
	
	public String toString(){
		return "ID: " + studentId + " and grade: " + grade;
	}

}
