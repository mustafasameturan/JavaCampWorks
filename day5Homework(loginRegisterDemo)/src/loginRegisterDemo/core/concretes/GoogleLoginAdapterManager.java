package loginRegisterDemo.core.concretes;

import loginRegisterDemo.core.abstracts.LoginService;
import loginRegisterDemo.googleMicroService.GoogleLoginLoginManager;

public class GoogleLoginAdapterManager implements LoginService {

	@Override
	public boolean login(String email, String password) {
		
		GoogleLoginLoginManager googleRegisterLoginManager = new GoogleLoginLoginManager();	
		googleRegisterLoginManager.login(email, password);
		return true;
	}

	

}
