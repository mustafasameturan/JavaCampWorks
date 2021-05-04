package Concrete;

import Abstract.GamerCheckService;
import Abstract.GamerService;
import Entities.Gamer;

public class GamerManager implements GamerService {

	private GamerCheckService gamerCheckService;
	
	//dependency injection
	public GamerManager(GamerCheckService gamerCheckService) {
		this.gamerCheckService = gamerCheckService;
	}
	
	@Override
	public void add(Gamer gamer) {
		if (gamerCheckService.checkIfPersonReal(gamer)) {
			System.out.println("E-Devlet verification is succesful. Welcome to the system : " + gamer.getFirstName() + gamer.getLastName());
		}
		else {
			System.out.println("Error! Player is not added.");
		}
		
	}

	@Override
	public void update(Gamer gamer) {
		System.out.println(gamer.getFirstName() + gamer.getLastName() + " is updated!");
	}

	@Override
	public void delete(Gamer gamer) {
		System.out.println(gamer.getFirstName() + gamer.getLastName() + " is deleted!");	
	}

}
