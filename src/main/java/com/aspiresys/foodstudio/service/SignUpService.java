package com.aspiresys.foodstudio.service;

import com.aspiresys.foodstudio.model.Login;
import com.aspiresys.foodstudio.model.Users;

public interface SignUpService {
	
	public Login CreateUserLogin(Login login);
	public Users CreateUser(Users user);

}
