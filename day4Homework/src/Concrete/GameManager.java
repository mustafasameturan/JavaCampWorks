package Concrete;

import Abstract.GameService;
import Entities.Campaign;
import Entities.Game;
import Entities.Gamer;

public class GameManager implements GameService{

	@Override
	public void add(Game game) {
		System.out.println("Game is added to system! :  " + game.getGameName() + " - " + game.getGamePrice() );
		
	}

	@Override
	public void update(Game game) {
		System.out.println("Game is updated to system! : " + game.getGameName());
		
	}

	@Override
	public void delete(Game game) {
		System.out.println("Game is deleted to system! : " + game.getGameName());
		
	}

	@Override
	public void sell(Game game, Gamer gamer) {
		System.out.println("The game named " + game.getGameName() + " was sold to " 
				+ gamer.getFirstName() + gamer.getLastName() + " for " + game.getGamePrice() + " TL.");
		
	}

	@Override
	public void sellWithCampaign(Game game, Gamer gamer, Campaign campaign) {
		double newPrice = game.getGamePrice() - campaign.getDiscountAmount();
		System.out.println("The game named " + game.getGameName() + " was sold to " 
				+ gamer.getFirstName() + gamer.getLastName() + " for campaign price " + newPrice + " TL.");
		
	}

}
