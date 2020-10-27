package org.hcl.dao;

import java.util.List;

import org.hcl.entities.*;
import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.criterion.Restrictions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class UserDaoImpl implements UserDao {
	@Autowired
	SessionFactory factory;

	@Override
	public void insert(User user) {
		Session session = factory.openSession();
		int value = (Integer) session.save(user);

	}

	@Override
	public boolean login(String userId, String password) {
		Session session = factory.getCurrentSession();
		Criteria criteria = session.createCriteria(User.class);
		criteria.add(Restrictions.like("userId", userId));
		boolean flag = false;
		Object finalValue = criteria.uniqueResult();
		if (finalValue != null) {
			User user = (User) finalValue;
			if (user.getPassword().equalsIgnoreCase(password)) {
				flag = true;
			} else {
				flag = false;
			}

		}

		return flag;
	}

}
