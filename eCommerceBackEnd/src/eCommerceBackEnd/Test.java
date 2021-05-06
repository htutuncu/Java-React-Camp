package eCommerceBackEnd;

import java.util.List;

import eCommerceBackEnd.business.abstracts.UserService;
import eCommerceBackEnd.business.concretes.MailVerification;
import eCommerceBackEnd.business.concretes.UserManager;
import eCommerceBackEnd.business.concretes.UserValidation;
import eCommerceBackEnd.core.GoogleAuthenticationAdapter;
import eCommerceBackEnd.dataAccess.abstracts.UserDao;
import eCommerceBackEnd.dataAccess.concretes.DatabaseUserDao;
import eCommerceBackEnd.entities.concretes.User;

public class Test {

	public static void main(String[] args) throws InterruptedException {
		UserService userService = new UserManager(new DatabaseUserDao(), new UserValidation(), new MailVerification());
		
		System.out.println("\n------------------TEST #1--------------------------\n");
		User user = new User("Hikmet","Tutuncu","hkmttnc@gmail.com","123456");
		userService.add(user);
		
		System.out.println("\n------------------TEST #2--------------------------\n");
		User user3 = new User("Hikmet","Tutuncu","hkmttnc@gmail.com","123456");
		userService.add(user3);
		
		
		System.out.println("\n------------------TEST #3--------------------------\n");
		
		User user1 = new User("H","Tutuncu","hkmttnc@gmail.com","123456");
		userService.add(user1);
		
		System.out.println("\n------------------TEST #4--------------------------\n");
		
		User user2 = new User("Hikmet","Tutuncu","hkmttncgmail.com","123456");
		userService.add(user2);
		
		System.out.println("\n------------------TEST #5--------------------------\n");
		
		User user4 = new User("Samet","Tutuncu","hkmttnc1@gmail.com","123456");
		userService.add(user4);
		
		System.out.println("\n------------------TEST #6--------------------------\n");
		
		userService = new UserManager(new DatabaseUserDao(),new UserValidation() ,new GoogleAuthenticationAdapter() );
		User user5 = new User("Hikmet","Pars","hikmet17@gmail.com","123456");
		userService.add(user5);
		
		System.out.println("\n------------------TEST #7--------------------------\n");
		
		User user6 = new User("Hikmet","Pars","hikmet17@gmail.com","123456");
		userService.add(user6);
		
	}

}
