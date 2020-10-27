package org.hcl.service;

import java.util.List;

import org.hcl.dao.UserDao;
import org.hcl.entities.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional

public class UserServiceImpl implements UserService {
	@Autowired
	UserDao userdao;

	@Override
	public void insert(User user) {
		userdao.insert(user);
	}

	@Override
	public boolean login(String userId, String password) {
		return userdao.login(userId, password);
		
	}
	
	

}
