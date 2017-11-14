package cz.expertkom.ju.springdemo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.springdemorhr.entity.User;
import com.example.springdemorhr.interfaces.UserRepository;

import cz.expertkom.ju.springdemo.interfaces.UserService;

@Service
public class UserServiceImpl implements UserService {

	@Autowired
	private UserRepository userRepository;
	
	
	@Override
	public User getUser(String username) {
		return userRepository.getUser(username);
	}

}
