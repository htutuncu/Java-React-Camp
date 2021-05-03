import Entities.*;
import Platform.CampaignManager;
import Platform.GameManager;
import Platform.UserManager;
import Platform.UserValidationService;
import Platform.ValidationAdapter;

public class Main {

	public static void main(String[] args) {
		UserManager userManager = new UserManager(new ValidationAdapter());
		User user = new User("31246312978", "Hikmet", "Tütüncü", 1996);
		
		userManager.addUser(user);
		
		GameManager gameManager = new GameManager();
		Game game = new Game("Age of Empires II",55.49);
		
		gameManager.add(game);
		
		CampaignManager campaignManager = new CampaignManager();
		Campaign campaign = new Campaign("Fall Season", 50);
		
		campaignManager.add(campaign);
		System.out.println();
		
		gameManager.sellGame(user, game, campaign);
		
		
	}

}
