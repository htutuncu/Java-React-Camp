package Platform;

import Entities.User;

public class UserManager implements UserService{

	
	private UserValidationService userValidation;
	
	
	public UserManager(UserValidationService userValidation) {
		this.userValidation = userValidation;
	}
	
	@Override
	public void addUser(User user) {
		
		if(userValidation.isValidUser(user)) {
			System.out.println("User added : " + user.getFirstName() + " " + user.getLastName());
		}else {
			System.out.println("User is not valid.");
		}
		
		
		
	}

	@Override
	public void deleteUser(User user) {
		System.out.println("User deleted : " + user.getFirstName() + " " + user.getLastName());
		
	}

	@Override
	public void updateUser(User user) {
		System.out.println("User updated : " + user.getFirstName() + " " + user.getLastName());
		
	}
	
}
