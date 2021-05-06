package loginRegisterDemo.core.concretes;

import loginRegisterDemo.core.abstracts.RegisterService;
import loginRegisterDemo.googleMicroService.GoogleRegisterLoginManager;

public class GoogleRegisterAdapterManager implements RegisterService {

	@Override
	public boolean login(String email, String password) {
		
		GoogleRegisterLoginManager googleRegisterLoginManager = new GoogleRegisterLoginManager();	
		googleRegisterLoginManager.login(email, password);
		return true;
	}

	

}
