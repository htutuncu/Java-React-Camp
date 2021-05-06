package eCommerceBackEnd.business.abstracts;

import eCommerceBackEnd.entities.concretes.User;

public interface VerificationService {
	void login(User user);
}
