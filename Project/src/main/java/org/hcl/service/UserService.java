package org.hcl.service;

import org.hcl.entities.User;

import java.util.*;

public interface UserService {
	public void insert(User user);
	public boolean login(String userId,String password);


	
	
	

}
