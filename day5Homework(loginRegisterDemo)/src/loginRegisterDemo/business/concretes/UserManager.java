package loginRegisterDemo.business.concretes;

import java.util.ArrayList;
import java.util.List;
import java.util.regex.Pattern;

import loginRegisterDemo.business.abstracts.UserService;
import loginRegisterDemo.business.abstracts.VerificationService;
import loginRegisterDemo.core.abstracts.RegisterService;
import loginRegisterDemo.dataAccess.abstracts.UserDao;
import loginRegisterDemo.entities.concretes.User;

public class UserManager implements UserService {

	private UserDao userDao;
	private RegisterService registerService;
	private VerificationService verificationService;
	private ArrayList<String> eMailList = new ArrayList<String>();
	private ArrayList<String> passwordList = new ArrayList<String>();
	
	public static boolean isEmailValid(String email) {
		final Pattern EMAIL_REGEX = Pattern.compile("[a-z0-9!#$%&'*+/=?^_`{|}~-]+(?:.[a-z0-9!#$%&'*+/=?^_`{|}~-]+)*@(?:[a-z0-9](?:[a-z0-9-]*[a-z0-9])?.)+[a-z0-9](?:[a-z0-9-]*[a-z0-9])?", Pattern.CASE_INSENSITIVE);
	    return EMAIL_REGEX.matcher(email).matches();
	}
	
	public static boolean isEmailValidOnClick() {
		return true;
	}
	
	public UserManager(UserDao userDao, RegisterService registerService, VerificationService verificationService) {
		this.verificationService = verificationService;
		this.userDao = userDao;
		this.registerService = registerService;
	}                                                   
	
	@Override
	public void register(User user) {
		if(eMailList.contains(user.getEmail())) {
			System.out.println("Girmiþ olduðunuz e-posta adresi sistemde kayýtlýdýr. Lütfen farklý bir e-posta giriniz.");
			return;
		}
		if(user.getPassword().length() < 6) {
			System.out.println("Parola en az 6 karakterden oluþmalýdýr.");
			return;
		}
		if(user.getFirstName().length() < 2 || user.getLastName().length() < 2) {
			System.out.println("Ad ve soyad en az 2 karakterden oluþmalýdýr.");
			return;
		}
		
		if(isEmailValid(user.getEmail()) != true) {
			System.out.println("Lütfen geçerli bir e-posta giriniz.");
			return;
		}
		else {
			System.out.println(user.getEmail() + " e-posta adresiniz sisteme kayýt edilmiþtir. Doðrulama postasý gönderilmiþtir.");
			
			if(isEmailValidOnClick() != true) {
				System.out.println("Lütfen e-posta adresiniz doðrulayýnýz.");
			}
			else {
				verificationService.verificate(user.getEmail());
				System.out.println("Sisteme baþarýlý þekilde kayýt oldunuz.");
				userDao.add(user);
				eMailList.add(user.getEmail());
				passwordList.add(user.getPassword());
			}
			
			
		}
			
	}

	@Override
	public void login(String email, String password) {
		if (eMailList.contains(email) && passwordList.contains(password)) {
			System.out.println("Giriþ Baþarý ile tamamlandý.");
			return;
		}
		else {
			System.out.println("E-Posta veya þifreniz yanlýþ. Lütfen tekrar deneyiniz.");
		}
		
	}

	@Override
	public boolean loginWithGoogle(String email, String password) {
		if(!registerService.login(email,password)){
            System.out.println("Google bilgilerinizi onaylamadý");
            return false;
        }
		else {
			return true;
		}
		
	}
}
