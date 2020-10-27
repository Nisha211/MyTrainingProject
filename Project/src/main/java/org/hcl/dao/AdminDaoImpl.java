package org.hcl.dao;

import org.hcl.entities.Admin;
import org.hcl.entities.User;
import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.criterion.Restrictions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
@Repository
public class AdminDaoImpl implements AdminDao {
	@Autowired
	SessionFactory factory;

	public void insert(Admin admin) {
		Session session=factory.openSession();
		int value=(Integer) session.save(admin);

}

	@Override
	public boolean login(String vendorId, String password) {
		
		Session session = factory.getCurrentSession();
		Criteria criteria = session.createCriteria(Admin.class);
		criteria.add(Restrictions.like("vendorId", vendorId));
		boolean flag = false;
		Object finalValue = criteria.uniqueResult();
		if (finalValue != null) {
			Admin admin = (Admin) finalValue;
			if (admin.getPassword().equalsIgnoreCase(password)) {
				flag = true;
			} else {
				flag = false;
			}

		}

		return flag;
	}
	
	
}
