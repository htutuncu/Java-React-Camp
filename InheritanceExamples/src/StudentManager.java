
public class StudentManager extends UserManager{
	
	@Override
	public void addUser(User user) {
		System.out.println(user.getUserName() + "student added.");
	}
	
	@Override
	public void deleteUser(User user) {
		System.out.println(user.getUserName() + "student deleted.");
	}
	
	@Override
	public void getUserID(User user) {
		System.out.println("ID of student is" + user.getUserName() + "changed to : " + user.getUserID()); 
	}
	
	@Override
	public void updateUserName(User user, String name) {
		System.out.println("Name of student is" + user.getUserName() + "changed to : " + user.getUserID());
		user.setUserName(name);
	}
	
	
}
