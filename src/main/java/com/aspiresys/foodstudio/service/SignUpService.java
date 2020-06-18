package com.aspiresys.foodstudio.service;

import com.aspiresys.foodstudio.model.Login;
import com.aspiresys.foodstudio.model.User;

public interface SignUpService {
	
	public Login CreateUserLogin(Login login);
	public User CreateUser(User user);

}
