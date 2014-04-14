package sy.action;

import java.io.IOException;
import java.util.Date;
import java.util.HashMap;

import org.apache.log4j.Logger;

import org.apache.struts2.ServletActionContext;
import org.apache.struts2.convention.annotation.Action;
import org.apache.struts2.convention.annotation.Namespace;
import org.apache.struts2.convention.annotation.ParentPackage;
import org.springframework.beans.factory.annotation.Autowired;

import com.alibaba.fastjson.JSON;
import com.sun.xml.internal.xsom.impl.scd.Iterators.Map;

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
	public void reg(){
	    String name = ServletActionContext.getRequest().getParameter("name");
	    String pwd = ServletActionContext.getRequest().getParameter("pwd");
	    String json = "";
	    HashMap<String, Object> m = new HashMap<String, Object>();
		try {
			userservice.reg(name, pwd);
			m.put("success", true);
			m.put("msg", "注册成功");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			m.put("success", true);
			m.put("msg", "注册成功");
		}
		try {
			ServletActionContext.getResponse().getWriter().write(JSON.toJSONString(m));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
