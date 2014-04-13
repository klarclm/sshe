package sy.service.impl;

import java.io.Serializable;

import org.apache.log4j.Logger;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import sy.dao.UserDaoI;
import sy.model.Tuser;
import sy.service.UserServiceI;

@Service("UserService")
public class UserServiceImpl implements UserServiceI {
	/**
	 * Logger for this class
	 */
	private static final Logger logger = Logger.getLogger(UserServiceImpl.class);

	private UserDaoI usrDao;
	public UserDaoI getUsrDao() {
		return usrDao;
	}
	@Autowired
	public void setUsrDao(UserDaoI usrDao) {
		this.usrDao = usrDao;
	}
	@Override
	public void test() {
		// TODO Auto-generated method stub
		logger.info("logger.info.cs");
		
	}
	@Override
	public Serializable save(Tuser t) {
		this.usrDao.save(t);
		// TODO Auto-generated method stub
		return null;
	}

}
