package loginRegisterDemo.business.concretes;

import loginRegisterDemo.business.abstracts.VerificationService;

public class VerificationManager implements VerificationService{

	@Override
	public boolean verificate(String email) {
		
		System.out.println(email + " do�rulamas� tamamland�.");
		
		//Gerekli i� kodlar�
		//
		//
		
		return true;
	}

}
