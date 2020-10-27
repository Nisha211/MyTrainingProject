package org.hcl.service;

import org.hcl.entities.Admin;

public interface AdminService {
	public void insert(Admin admin);
	public boolean login(String vendorId,String password);


}
