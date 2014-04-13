package sy.action;

import java.util.Date;

import org.apache.log4j.Logger;

import org.apache.struts2.convention.annotation.Action;
import org.apache.struts2.convention.annotation.Namespace;
import org.apache.struts2.convention.annotation.ParentPackage;
import org.springframework.beans.factory.annotation.Autowired;

import sy.model.Tuser;
import sy.service.UserServiceI;

@ParentPackage("basePackage")
@Namespace("/")
@Action(value = "UserAction")
public class UserAction {
	/**
	 * Logger for this class
	 */
	private static final Logger logger = Logger.getLogger(UserAction.class);

	private UserServiceI userservice;
	
	public UserServiceI getUserservice() {
		return userservice;
	}

	@Autowired
	public void setUserservice(UserServiceI userservice) {
		this.userservice = userservice;
	}

	public void test() {
		logger.info("visit useraction");
		userservice.test();
	}
	public void addUser(){
		Tuser t = new Tuser();
		t.setId("2");
		t.setName("cs2");
		t.setCreatedatetime(new Date());
		this.userservice.save(t);
	}
}
