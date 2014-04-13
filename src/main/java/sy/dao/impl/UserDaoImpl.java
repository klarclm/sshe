package sy.dao.impl;

import java.io.Serializable;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import sy.dao.UserDaoI;
import sy.model.Tuser;

@Repository("userDao")
public class UserDaoImpl implements UserDaoI {

	private SessionFactory sessionFactory;
	
	public SessionFactory getSessionFactory() {
		return sessionFactory;
	}

	@Autowired
	public void setSessionFactory(SessionFactory sessionFactory) {
		this.sessionFactory = sessionFactory;
	}

	@Override
	public Serializable save(Tuser t) {
		this.sessionFactory.getCurrentSession().save(t);
		// TODO Auto-generated method stub
		return null;
	}

}
