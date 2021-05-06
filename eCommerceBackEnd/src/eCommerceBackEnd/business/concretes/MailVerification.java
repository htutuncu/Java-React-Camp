package eCommerceBackEnd.business.concretes;

import eCommerceBackEnd.business.abstracts.VerificationService;
import eCommerceBackEnd.entities.concretes.User;

public class MailVerification implements VerificationService{

	@Override
	public void login(User user) {
		System.out.println("Verification code is sended to "+user.getEmail());
		
	}
	
}
