package inheritance3;

import java.util.Scanner;

public class InstructorManager extends UserManager {
	Scanner s = new Scanner(System.in);
	public void addCourse(){
		System.out.print("Kurs Ad�: ");
		s.nextLine();
		
		System.out.print("Kurs �creti: ");
		s.nextInt();
		s.nextLine();
		
		System.out.print("E�itmen Ad�: ");
		s.nextLine();
		
		System.out.println("Kurs Ba�ar�yla Eklendi.");
		
		
	}
	public void courseDelete() {
		System.out.println("Kursu Silmek �stiyor musunuz?");
		String answer = s.nextLine();
		
		if(answer.equals("Evet") || answer.equals("evet")) {
			System.out.println("Kurs Silindi.");
		}
		else {
			System.out.println("Kursu Silmekten Vazge�tiniz.");
		}
	}
	
}
