package day4Homework;

import Concrete.CampaignManager;
import Concrete.GameManager;
import Concrete.GamerCheckManager;
import Concrete.GamerManager;
import Entities.Campaign;
import Entities.Game;
import Entities.Gamer;

public class Main {
	public static void main(String[] args) {
		Gamer gamer1 = new Gamer();
		gamer1.setId(1);
		gamer1.setFirstName("Mustafa Samet");
		gamer1.setLastName(" Turan");
		gamer1.setBirthOfYear(2000);
		gamer1.setNationalityId("11111111111");
		
		Gamer gamer2 = new Gamer();
		gamer2.setId(2);
		gamer2.setFirstName("Yaðmur Buse");
		gamer2.setLastName(" Karabýyýk");
		gamer2.setBirthOfYear(2001);
		gamer2.setNationalityId("22222222222");
		
		GamerManager gamerManager = new GamerManager(new GamerCheckManager());
		gamerManager.add(gamer1);
		gamerManager.update(gamer2);
		gamerManager.delete(gamer1);
		
		
		System.out.println("\n************************************");
		
		Campaign campaign1 = new Campaign();
		campaign1.setId(1);
		campaign1.setCampaignName("Spring discount!");
		campaign1.setDiscountAmount(50);
		
		Campaign campaign2 = new Campaign();
		campaign2.setId(2);
		campaign2.setCampaignName("Surprise discount!");
		campaign2.setDiscountAmount(30);
		
		CampaignManager campaignManager = new CampaignManager();
		campaignManager.add(campaign1);
		campaignManager.update(campaign2);
		campaignManager.delete(campaign1);
		
		System.out.println("\n************************************");
		
		Game game1 = new Game();
		game1.setId(1);
		game1.setGameName("PES 2021");
		game1.setGamePrice(75);
		
		Game game2 = new Game();
		game2.setId(2);
		game2.setGameName("Counter Strike : Global Offensive");
		game2.setGamePrice(120);
		
		Game game3 = new Game();
		game3.setId(3);
		game3.setGameName("Battle of Middle Earth");
		game3.setGamePrice(200);
		
		GameManager gameManager = new GameManager();
		gameManager.add(game1);
		gameManager.update(game2);
		gameManager.delete(game3);
		gameManager.sell(game1, gamer1);
		gameManager.sell(game2, gamer2);
		gameManager.sell(game3, gamer2);
		System.out.println("**************");
		gameManager.sellWithCampaign(game1, gamer2, campaign1);
		gameManager.sellWithCampaign(game2, gamer1, campaign2);
		gameManager.sellWithCampaign(game3, gamer2, campaign1);
		
		
	}
}
