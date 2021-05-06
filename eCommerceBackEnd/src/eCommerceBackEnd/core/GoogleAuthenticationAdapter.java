package eCommerceBackEnd.core;

import eCommerceBackEnd.business.abstracts.VerificationService;
import eCommerceBackEnd.entities.concretes.User;
import eCommerceBackEnd.googleAuth.GoogleAuthentication;

public class GoogleAuthenticationAdapter implements AuthService,VerificationService{

	@Override
	public void login(User user) {
		GoogleAuthentication googleAuthentication = new GoogleAuthentication();
		googleAuthentication.login(user.getEmail());
		
	}
	
}
