package inheritanceOdev;

public class Main {

	public static void main(String[] args) {
		
		Student student1=new Student();
		student1.setFirstName("�zge");		
		student1.setLastName("Yurdusev");
		student1.setCourse("Java");
			
		Student student2=new Student();
		student2.setFirstName("�z�m");
		student2.setLastName("Deniz");
		student2.setCourse("C#");
		
		Instructor instructor1=new Instructor();
		instructor1.setFirstName("Engin");
		instructor1.setLastName("Demiro�");
		instructor1.setCourse("Java Programlama");
				
		Student[] students= {student1,student2};
		
		StudentManager studentManager=new StudentManager();
		studentManager.AddStudent(student1);
		studentManager.StudentList(students);
		
		InstructorManager instructorManager=new InstructorManager();
		instructorManager.Add(instructor1);
		
		InstructorManager instructorManager2=new InstructorManager();
		instructorManager2.CreateCourse(instructor1);
		
	}

}
