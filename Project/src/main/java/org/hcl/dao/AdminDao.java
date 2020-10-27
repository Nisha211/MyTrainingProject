package org.hcl.dao;

import org.hcl.entities.Admin;

public interface AdminDao {
	public void insert(Admin admin);
	public boolean login(String vendorId,String password);


}
