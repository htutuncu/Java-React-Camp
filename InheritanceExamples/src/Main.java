
public class Main {

	public static void main(String[] args) {
		
		UserManager userManager = new UserManager();
		
		
		
		User user1 = new User();
		user1.setUserName("Mehmet");
		
		Student student1 = new Student();
		student1.setUserName("Umit");
		
		User[] users = {user1,student1};
		
		System.out.println("Multiple  user adding : ");
		
		userManager.addMultipleUsers(users);
		
		
	}

}
