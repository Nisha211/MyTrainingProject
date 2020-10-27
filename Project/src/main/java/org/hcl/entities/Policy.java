package org.hcl.entities;

import java.sql.Date;
import java.util.HashSet;
import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

@Entity
public class Policy {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer policyId;
	@NotNull(message = "is required")
	@Size(min = 1, message = "is required")
	private String policyName;

	@NotNull(message = "is required")
	@Size(min = 1, message = "is required")
	private String typeOfPolicy;

	@NotNull(message = "is required")
	@Size(min = 1, message = "is required")
	private String policyOwner;

	@NotNull(message = "is required")
	private String policyTime;

	@NotNull(message = "is required")
	private Date policyDate;

	@NotNull(message = "is required")
	private Integer policyAmount;

	@ManyToMany(mappedBy = "policy")
	private Set<User> users = new HashSet<User>();

	public Policy() {
		// TODO Auto-generated constructor stub
	}

	public Policy(Integer policyId,
			@NotNull(message = "is required") @Size(min = 1, message = "is required") String policyName,
			@NotNull(message = "is required") @Size(min = 1, message = "is required") String typeOfPolicy,
			@NotNull(message = "is required") @Size(min = 1, message = "is required") String policyOwner,
			@NotNull(message = "is required") @Size(min = 1, message = "is required") String policyTime,
			@NotNull(message = "is required") @Size(min = 1, message = "is required") Date policyDate,
			@NotNull(message = "is required") @Size(min = 1, message = "is required") Integer policyAmount,
			Set<User> users) {
		super();
		this.policyId = policyId;
		this.policyName = policyName;
		this.typeOfPolicy = typeOfPolicy;
		this.policyOwner = policyOwner;
		this.policyTime = policyTime;
		this.policyDate = policyDate;
		this.policyAmount = policyAmount;
		this.users = users;
	}

	public Integer getPolicyId() {
		return policyId;
	}

	public void setPolicyId(Integer policyId) {
		this.policyId = policyId;
	}

	public String getPolicyName() {
		return policyName;
	}

	public void setPolicyName(String policyName) {
		this.policyName = policyName;
	}

	public String getTypeOfPolicy() {
		return typeOfPolicy;
	}

	public void setTypeOfPolicy(String typeOfPolicy) {
		this.typeOfPolicy = typeOfPolicy;
	}

	public String getPolicyOwner() {
		return policyOwner;
	}

	public void setPolicyOwner(String policyOwner) {
		this.policyOwner = policyOwner;
	}

	public String getPolicyTime() {
		return policyTime;
	}

	public void setPolicyTime(String policyTime) {
		this.policyTime = policyTime;
	}

	public Date getPolicyDate() {
		return policyDate;
	}

	public void setPolicyDate(Date policyDate) {
		this.policyDate = policyDate;
	}

	public Integer getPolicyAmount() {
		return policyAmount;
	}

	public void setPolicyAmount(Integer policyAmount) {
		this.policyAmount = policyAmount;
	}

	public Set<User> getUsers() {
		return users;
	}

	public void setUsers(Set<User> users) {
		this.users = users;
	}
	public void add(User user) {
		users.add(user);
	}

}
