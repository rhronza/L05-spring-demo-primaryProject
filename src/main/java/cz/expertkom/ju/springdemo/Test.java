package cz.expertkom.ju.springdemo;

import javax.annotation.PostConstruct;

import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.springdemorhr.entity.User;

import cz.expertkom.ju.springdemo.interfaces.UserService;

@Service
public class Test {

	private static final Logger logger = LogManager.getLogger(Test.class);
	
	@Autowired
	private UserService userService;
	

	@PostConstruct
	public void test() {
		
		User user = userService.getUser("rudolf");
		
		logger.info("\n\n******************** \nuser: " + user+"\n*****************************");
		
	}
	
}
