package loginRegisterDemo.core.concretes;

import loginRegisterDemo.core.abstracts.LoginService;
import loginRegisterDemo.googleMicroService.GoogleLoginManager;

public class GoogleLoginAdapterManager implements LoginService {

	@Override
	public boolean login(String email, String password) {
		
		GoogleLoginManager googleRegisterLoginManager = new GoogleLoginManager();	
		googleRegisterLoginManager.login(email, password);
		return true;
	}

	

}
