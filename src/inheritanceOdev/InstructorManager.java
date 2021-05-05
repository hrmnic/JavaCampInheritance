package inheritanceOdev;

public class InstructorManager extends UserManager{
	
	public void Add(Instructor instructor) {
		System.out.println(instructor.getFirstName()+" "+instructor.getLastName()+": Egitmen eklendi.");
	
	}
	public void CreateCourse(Instructor instructor) {
		System.out.println(instructor.getFirstName()+" "+instructor.getLastName()+" : " +instructor.getCourse()+ " kursu olusturuldu.");
	}

}
