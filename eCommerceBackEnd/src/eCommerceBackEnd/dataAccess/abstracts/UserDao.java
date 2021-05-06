package eCommerceBackEnd.dataAccess.abstracts;

import java.util.List;

import eCommerceBackEnd.entities.concretes.User;

public interface UserDao {
	void add(User user);
	void update(User user);
	void delete(User user);
	User getUser(String email);
	List<User> getAll();
}
