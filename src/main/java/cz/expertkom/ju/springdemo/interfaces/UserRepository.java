package cz.expertkom.ju.springdemo.interfaces;

import cz.expertkom.ju.springdemo.entity.User;

public interface UserRepository {

	User getUser(String username);
	
}
