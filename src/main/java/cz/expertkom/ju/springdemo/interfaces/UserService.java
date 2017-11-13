package cz.expertkom.ju.springdemo.interfaces;

import cz.expertkom.ju.springdemo.entity.User;

public interface UserService {

	User getUser(String username);
	
}
