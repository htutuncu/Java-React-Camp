
public class UserManager {
	public void addUser(User user) {
		System.out.println(user.getUserName() + " user added.");
	}
	
	public void deleteUser(User user) {
		System.out.println(user.getUserName() + " user deleted.");
	}
	
	public void getUserID(User user) {
		System.out.println("ID of user is" + user.getUserName() + " changed to : " + user.getUserID()); 
	}
	
	public void updateUserName(User user, String name) {
		System.out.println("Name of user is" + user.getUserName() + " changed to : " + user.getUserID());
		user.setUserName(name);
	}
	
	public void addMultipleUsers(User[] users) {
		
		for(User user: users) {
			addUser(user);
		}
	}
	
}
