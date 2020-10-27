package org.hcl.service;

import org.hcl.dao.PolicyDao;
import org.hcl.entities.Policy;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
public class PolicyServiceImpl implements PolicyService{
	@Autowired
	PolicyDao policyDao;
	

	@Override
	public boolean insert(Policy policy) {
		boolean value=policyDao.insert(policy);
		return value;
		
		
	}

	@Override
	public Policy getPolicy(Integer policyId) {
		Policy policy=policyDao.getPolicy(policyId);
		return policy;

	
	}

	@Override
	public void editPolicy(Policy policyId) {
		policyDao.editPolicy(policyId);
	
		
	}
	
	

}
