package inheritance3;

public class Main {

	public static void main(String[] args) {
		Instructor instructor1 = new Instructor(1, "Engin Demiro�", "engindmrg", "12345", "MCT PMP", 15, 150000);
		Instructor instructor2 = new Instructor(2, "Bedirhan G�rler", "bgurler", "98765", "Hi� Bi�ey", 3, 32000);
		
		Student student1 = new Student(1, "Ahmet Mehmet", "ahmeh", "4567", 3, 45.3);
		Student student2 = new Student(2, "Kerem Var��", "kvaris", "34567", 6, 100.0);
		
		Instructor[] instructors = {instructor1,instructor2};
		Student[] students = {student1,student2};
		
		InstructorManager instructorManager = new InstructorManager();
		//instructorManager.addCourse();
		//instructorManager.courseDelete();
		
		StudentManager studentManager = new StudentManager();
		//studentManager.joinCourse();
		//studentManager.outCourse();
		//studentManager.messageToInstructor(instructor1);
		
		
	}

}
