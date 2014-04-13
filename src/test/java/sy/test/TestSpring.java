package sy.test;

import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import sy.service.UserServiceI;

public class TestSpring {

	private UserServiceI userService;
	
	public UserServiceI getUserService() {
		return userService;
	}

	@Autowired
	public void setUserService(UserServiceI userService) {
		this.userService = userService;
	}

	@Test
	public void test(){
/*		ApplicationContext ac = new ClassPathXmlApplicationContext((new String[]{"classpath:spring.xml"}));
		UserServiceI userService = (UserServiceI) ac.getBean("UserService");
		userService.test();		*/
	}
}
