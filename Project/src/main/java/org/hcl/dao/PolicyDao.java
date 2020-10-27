package org.hcl.dao;

import org.hcl.entities.Policy;

public interface PolicyDao {
	public boolean insert(Policy policy);

	public Policy getPolicy(Integer policyId);

	public void editPolicy(Policy policyId);


}
