package org.hcl.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

@Entity
public class Admin {
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	
	@NotNull(message = "is required")
	@Size(min = 1, message = "is required")
	private String firstName;
	
	@NotNull(message = "is required")
	@Size(min = 1, message = "is required")
	private String lastName;

	@NotNull(message = "is required")
	private Integer age;

	@NotNull(message = "is required")
	@Size(min = 1, message = "is required")
	private String gender;
	
	@NotNull(message = "is required")
	@Size(min = 1, message = "is required")
	private String contactno;
	
	@NotNull(message = "is required")
	@Size(min = 1, message = "is required")
	private String vendorId;
	
	@NotNull(message = "is required")
	@Size(min = 1, message = "is required")
	private String password;
	
	public Admin() {
		// TODO Auto-generated constructor stub
	}

	public Admin(Integer id, @NotNull(message = "is required") @Size(min = 1, message = "is required") String firstName,
			@NotNull(message = "is required") @Size(min = 1, message = "is required") String lastName,
			@NotNull(message = "is required") Integer age,
			@NotNull(message = "is required") @Size(min = 1, message = "is required") String gender,
			@NotNull(message = "is required") @Size(min = 1, message = "is required") String contactno,
			@NotNull(message = "is required") @Size(min = 1, message = "is required") String vendorId,
			@NotNull(message = "is required") @Size(min = 1, message = "is required") String password) {
		super();
		this.id = id;
		this.firstName = firstName;
		this.lastName = lastName;
		this.age = age;
		this.gender = gender;
		this.contactno = contactno;
		this.vendorId = vendorId;
		this.password = password;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public Integer getAge() {
		return age;
	}

	public void setAge(Integer age) {
		this.age = age;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public String getContactno() {
		return contactno;
	}

	public void setContactno(String contactno) {
		this.contactno = contactno;
	}

	public String getVendorId() {
		return vendorId;
	}

	public void setVendorId(String vendorId) {
		this.vendorId = vendorId;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}
	
	
	
}
