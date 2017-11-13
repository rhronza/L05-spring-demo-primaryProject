package cz.expertkom.ju.springdemo;

import javax.annotation.PostConstruct;

import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cz.expertkom.ju.springdemo.entity.User;
import cz.expertkom.ju.springdemo.interfaces.UserService;
import cz.expertkom.ju.springdemo.repository.Testovaci;

@Service
public class Test {

	private static final Logger logger = LogManager.getLogger(Test.class);
	
	@Autowired
	private UserService userService;
	
	@Autowired
	Testovaci tst;
	
	@PostConstruct
	public void test() {
		
		User user = userService.getUser("karel");
		
		logger.info("\n\n******************** \nuser: " + user+"\n*****************************");
		
		tst.test();
	}
	
}
