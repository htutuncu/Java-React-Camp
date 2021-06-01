package com.hikmet.northwind.business.concretes;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hikmet.northwind.business.abstracts.UserService;
import com.hikmet.northwind.core.dataAccess.UserDao;
import com.hikmet.northwind.core.entities.User;
import com.hikmet.northwind.core.utilities.results.DataResult;
import com.hikmet.northwind.core.utilities.results.Result;
import com.hikmet.northwind.core.utilities.results.SuccessDataResult;
import com.hikmet.northwind.core.utilities.results.SuccessResult;

@Service
public class UserManager implements UserService{
	
	private UserDao userDao;
	
	@Autowired
	public UserManager(UserDao userDao) {
		super();
		this.userDao = userDao;
	}

	@Override
	public Result add(User user) {
		this.userDao.save(user);
		return new SuccessResult("Kullanici eklendi.") ;
	}

	@Override
	public DataResult<User> findByEmail(String email) {
		
		return new SuccessDataResult<User>(this.userDao.findByEmail(email),"Kullanıcı bulundu.");
	}

}
