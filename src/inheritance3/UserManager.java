package inheritance3;

public class UserManager {
	public void signIn(User user) {
		System.out.println(user.getFullName() + " Olarak Sisteme Giri� Yapt�n�z.");
	}
	public void signOut(User user) {
		System.out.println("��k�� Yap�ld�.");
	}
}
