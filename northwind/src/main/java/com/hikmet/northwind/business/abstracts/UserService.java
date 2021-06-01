package com.hikmet.northwind.business.abstracts;

import com.hikmet.northwind.core.entities.User;
import com.hikmet.northwind.core.utilities.results.DataResult;
import com.hikmet.northwind.core.utilities.results.Result;

public interface UserService {
	Result add(User user);
	DataResult<User> findByEmail(String email);
}
