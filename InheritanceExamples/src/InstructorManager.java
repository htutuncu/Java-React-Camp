
public class InstructorManager extends UserManager {
	
	@Override
	public void addUser(User user) {
		System.out.println(user.getUserName() + "instructor added.");
	}
	
	@Override
	public void deleteUser(User user) {
		System.out.println(user.getUserName() + "instructor deleted.");
	}
	
	@Override
	public void getUserID(User user) {
		System.out.println("ID of instructor is" + user.getUserName() + "changed to : " + user.getUserID()); 
	}
	
	@Override
	public void updateUserName(User user, String name) {
		System.out.println("Name of instructor is" + user.getUserName() + "changed to : " + user.getUserID());
		user.setUserName(name);
	}

}
