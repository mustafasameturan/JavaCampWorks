package loginRegisterDemo.googleMicroService;

public class GoogleRegisterLoginManager {
	
	public void login(String email, String password) {
		if(email.isEmpty() || password.isEmpty()) {
			System.out.println("Giri� ba�ar�s�z. L�tfen bilgileriniz giriniz.");
		}
		else {
			System.out.println("Google ile giri� yap�ld�.");
		}
		
		
	}
}
