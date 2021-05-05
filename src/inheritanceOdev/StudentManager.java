package inheritanceOdev;

public class StudentManager extends UserManager{
	
	public void AddStudent(Student student) {
		System.out.println(student.getFirstName() +" "+student.getLastName()+": Ogrenci eklendi");
	}
	
	public void StudentList(Student[] students) {
		for(Student student:students) {
			System.out.println(student.getFirstName()+" "+student.getLastName());
		}
	}
	
	public void courseRegister(Student student) {
		System.out.println(student.getCourse() + ": Kursa kayit olundu");
	}
}
