package loginRegisterDemo.googleMicroService;

public class GoogleRegisterLoginManager {
	
	public void login(String email, String password) {
		if(email.isEmpty() || password.isEmpty()) {
			System.out.println("Giriþ baþarýsýz. Lütfen bilgileriniz giriniz.");
		}
		else {
			System.out.println("Google ile giriþ yapýldý.");
		}
		
		
	}
}
