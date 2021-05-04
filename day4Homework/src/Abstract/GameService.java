package Abstract;

import Entities.Campaign;
import Entities.Game;
import Entities.Gamer;

public interface GameService extends BaseService<Game>{
	public void sell(Game game, Gamer gamer);
	
	public void sellWithCampaign(Game game, Gamer gamer, Campaign campaign);
}
