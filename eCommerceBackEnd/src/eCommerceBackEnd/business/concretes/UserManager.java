package eCommerceBackEnd.business.concretes;

import java.util.List;

import eCommerceBackEnd.business.abstracts.UserService;
import eCommerceBackEnd.business.abstracts.ValidationService;
import eCommerceBackEnd.business.abstracts.VerificationService;
import eCommerceBackEnd.dataAccess.abstracts.UserDao;
import eCommerceBackEnd.entities.concretes.User;

public class UserManager implements UserService{
	
	private UserDao userDao;
	private ValidationService validationService;
	private VerificationService verificationService;
	
	public UserManager(UserDao userDao,ValidationService validationService,VerificationService verificationService) {
		this.userDao = userDao;
		this.validationService = validationService;
		this.verificationService = verificationService;
	}
	
	
	@Override
	public void add(User user) throws InterruptedException {
		
		if(!validationService.isValid(user)) {
			System.out.println("User did not added.");
			return;
		}
		
		for(User u : userDao.getAll()) {
			if( u.getEmail().equals(user.getEmail())) {
				System.out.println("This e-mail is using by another user. " + u.getEmail());
				return;
			}
		}
		
		verificationService.login(user);
		Thread.sleep(500);
		
		System.out.println("Success.");
		
		
		userDao.add(user);
		
	}

	@Override
	public void delete(User user) {
		userDao.delete(user);
		
	}

	@Override
	public void update(User user) {
		userDao.update(user);
	}

	@Override
	public User getUser(String mail) {
		return userDao.getUser(mail);
	}

	@Override
	public List<User> getAll() {
		return userDao.getAll();
	}

}
