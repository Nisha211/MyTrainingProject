package org.hcl.service;

import org.hcl.entities.Policy;

public interface PolicyService {
	public boolean insert(Policy policy);
	public Policy getPolicy(Integer policyId);
	public void editPolicy(Policy policyId);
	

}
