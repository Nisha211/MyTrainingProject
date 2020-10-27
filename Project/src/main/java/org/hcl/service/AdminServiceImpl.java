package org.hcl.service;

import org.hcl.dao.AdminDao;
import org.hcl.dao.UserDao;
import org.hcl.entities.Admin;
import org.hcl.entities.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
@Service
@Transactional
public class AdminServiceImpl implements AdminService {
	@Autowired
	AdminDao admindao;

	public void insert(Admin admin) {
	   admindao.insert(admin);
		
	}

	@Override
	public boolean login(String vendorId, String password) {
		return admindao.login(vendorId, password);
		
	}

}
