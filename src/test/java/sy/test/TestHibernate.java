package sy.test;

import java.util.Date;

import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import sy.model.Tuser;
import sy.service.UserServiceI;

public class TestHibernate {

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
//		ApplicationContext ac = new ClassPathXmlApplicationContext((new String[]{"classpath:spring.xml","classpath:spring-hibernate.xml"}));
//		UserServiceI userService = (UserServiceI) ac.getBean("UserService");
//		Tuser t = new Tuser();
//		t.setId("1");
//		t.setName("cs1");
//		t.setPwd("123");
//		t.setCreatedatetime(new Date());
//		userService.save(t);		
	}
}
