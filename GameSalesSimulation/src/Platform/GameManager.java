package Platform;

import Entities.Campaign;
import Entities.Game;
import Entities.User;

public class GameManager implements GameService{

	@Override
	public void add(Game game) {
		System.out.println("Game added : " +game.getName() );
		
	}

	@Override
	public void delete(Game game) {
		System.out.println("Game deleted : " +game.getName() );
		
	}

	@Override
	public void update(Game game) {
		System.out.println("Game updated : " +game.getName() );
		
	}

	@Override
	public void sellGame(User user, Game game, Campaign campaign) {
		System.out.println(user.getFirstName() + " " + user.getLastName() + " purchased the game : " + game.getName());
		System.out.println("There is a campaign in that game. " + campaign.getName() + "  %"+campaign.getDiscountRate());
		System.out.println("Final price is : "+ game.getPrice());
		
	}
	
}
