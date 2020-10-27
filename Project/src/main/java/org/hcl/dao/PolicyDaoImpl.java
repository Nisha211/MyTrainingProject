package org.hcl.dao;

import org.hcl.entities.Policy;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
@Repository
public class PolicyDaoImpl implements PolicyDao {
	@Autowired
	SessionFactory factory;
	

	public boolean insert(Policy policy) {
		Session session=factory.openSession();
		int value=(Integer) session.save(policy);
		if(value==policy.getPolicyId()) {
			return true;
		}
		else {
			return false;
		}

	}


	@Override
	public Policy getPolicy(Integer policyId) {
		Session session = factory.getCurrentSession();
		return (Policy)session.get(Policy.class,policyId);

		
	}

	@Override
	public void editPolicy(Policy policyId) {
		Session session=factory.getCurrentSession();
		Policy firstPolicy=session.get(Policy.class, policyId.getPolicyId());
		firstPolicy.setPolicyName(policyId.getPolicyName());
		firstPolicy.setTypeOfPolicy(policyId.getTypeOfPolicy());
		firstPolicy.setPolicyTime(policyId.getPolicyTime());
		firstPolicy.setPolicyOwner(policyId.getPolicyOwner());
		firstPolicy.setPolicyDate(policyId.getPolicyDate());
		firstPolicy.setPolicyAmount(policyId.getPolicyAmount());
		firstPolicy.setPolicyOwner(policyId.getPolicyOwner());
		session.save(policyId);
		
		
	
	}
}
