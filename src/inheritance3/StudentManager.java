package inheritance3;

import java.util.Scanner;

public class StudentManager extends UserManager {
	Scanner s = new Scanner(System.in);
	
	public void joinCourse() {
		System.out.println("Kursa Ba�ar�yla Kay�t Oldunuz.");
	}
	public void outCourse() {
		System.out.println("Kurstan Ayr�ld�n�z.");
	}
	public void messageToInstructor(Instructor instructor) {
		System.out.println("Mesaj: ");
		s.nextLine();
		System.out.println("Mesaj�n�z " + instructor.getFullName() + " Adl� E�itmene G�nderildi.");
	}
}
