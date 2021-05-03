package Platform;

import Entities.*;

public interface GameService {
	public void add(Game game);
	public void delete(Game game);
	public void update(Game game);
	
	public void sellGame(User user,Game game,Campaign campaign);
}
