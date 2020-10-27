package org.hcl.dao;


import java.util.List;

import org.hcl.entities.User;

public interface UserDao {
	public void insert(User user);
	public boolean login(String userId,String password);

}
