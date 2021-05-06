package loginRegisterDemo;

import loginRegisterDemo.business.abstracts.UserService;
import loginRegisterDemo.business.concretes.UserManager;
import loginRegisterDemo.business.concretes.VerificationManager;
import loginRegisterDemo.core.concretes.GoogleLoginAdapterManager;
import loginRegisterDemo.dataAccess.entities.HibernateUserDao;
import loginRegisterDemo.entities.concretes.User;

public class Main {

	public static void main(String[] args) {
		
		
		User user1 = new User();
		user1.setId(1);
		user1.setFirstName("Mustafa Samet");
		user1.setLastName(" Turan");
		user1.setEmail("abc@gmail.com");
		user1.setPassword("12312312");
		
		User user2 = new User();
		user2.setId(2);
		user2.setFirstName("Yaðmur Buse");
		user2.setLastName(" Karabýyýk");
		user2.setEmail("abc@gmail.com");
		user2.setPassword("123123");
		
		UserService userService = new UserManager(new HibernateUserDao(), new GoogleLoginAdapterManager(), new VerificationManager()); 
		userService.register(user1);
		System.out.println("*********************");
		
		userService.register(user2);
		
		System.out.println("*********************");
		userService.login(user1.getEmail(), user1.getPassword());
		
		System.out.println("*********************");
		userService.loginWithGoogle(user1.getEmail(),user1.getPassword());
		

	}

}
