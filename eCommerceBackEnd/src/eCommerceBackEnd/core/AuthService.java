package eCommerceBackEnd.core;

import eCommerceBackEnd.entities.concretes.User;

public interface AuthService {
	void login(User user);
}
