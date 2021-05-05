package inheritanceOdev;

public class Student extends User{
	
	private String studentNumber;
	private double completionRate;
	

	public String getStudentNumber() {
		return studentNumber;
	}

	public void setStudentNumber(String studentNumber) {
		this.studentNumber = studentNumber;
	}

	public double getCompletionRate() {
		return completionRate;
	}	
	
}
