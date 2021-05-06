package eCommerceBackEnd.business.abstracts;

import eCommerceBackEnd.entities.concretes.User;

public interface ValidationService {
	boolean isValid(User user);
}
