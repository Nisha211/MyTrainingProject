package org.hcl.controller;

import java.sql.Date;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.hcl.entities.Admin;
import org.hcl.entities.Policy;
import org.hcl.service.AdminService;
import org.hcl.service.PolicyService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class AdminController {
	@Resource
	AdminService service;
	@Resource
	PolicyService policyService;

	@GetMapping("/adminLogin")
	public String showAdminLogin(Model model) {
		return "adminLogin";
	}

	@GetMapping("/adminRegistration")
	public String showAdminContact(Model model) {
		return "adminRegistration";
	}

	@PostMapping("/adminForm")
	public String showAdminForm(@RequestParam("firstName") String firstName, @RequestParam("lastName") String lastName,
			@RequestParam("age") int age, @RequestParam("gender") String gender,
			@RequestParam("contactno") String contactno, @RequestParam("vendorId") String vendorId,
			@RequestParam("password") String password, Model model) {
		Admin admin = new Admin();
		admin.setFirstName(firstName);
		admin.setLastName(lastName);
		admin.setAge(age);
		admin.setGender(gender);
		admin.setContactno(contactno);
		admin.setVendorId(vendorId);
		admin.setPassword(password);
		service.insert(admin);

		if (admin.getFirstName().equals(null) || admin.getLastName().equals(null) || admin.getAge() == 0
				|| admin.getGender().equals(null) || admin.getContactno().equals(null)
				|| admin.getVendorId().equals(null) || admin.getPassword().equals(null)) {
			model.addAttribute("error", "Please fill all the fields");
			return "adminLogin";
		}

		model.addAttribute("error", "successful registration");
		return "adminRegistration";

	}

	@PostMapping("/adminsubmit")
	public String loginForm(@RequestParam("vendorId") String vendorId, @RequestParam("password") String password,
			Model model, HttpSession session, HttpServletRequest request) {

		boolean valid = service.login(vendorId, password);
		if (valid) {
			model.addAttribute("success", vendorId);
			session.setAttribute("vendorId", vendorId);
			return "adminPage";
		}
		model.addAttribute("error", "invalid username or password");
		return "admin";
	}

	@GetMapping("/policyRegistration")
	public String policyform() {
		return "policyRegistration";
	}

	@PostMapping("/policycreation")
	public String policycreation(@RequestParam("policyId")Integer policyId,@RequestParam("policyName") String policyName,
			@RequestParam("policyOwner") String policyOwner, @RequestParam("typeOfPolicy") String typeOfPolicy,
			@RequestParam("policyTime") String policyTime, @RequestParam("policyDate") Date policyDate,
			@RequestParam("policyAmount") int policyAmount, Model model) {
		Policy policy = new Policy();
		policy.setPolicyId(policyId);
		policy.setPolicyName(policyName);
		policy.setPolicyOwner(policyOwner);
		policy.setTypeOfPolicy(typeOfPolicy);
		policy.setPolicyTime(policyTime);
		policy.setPolicyDate(policyDate);
		policy.setPolicyAmount(policyAmount);
		policyService.insert(policy);
		if (policy.getPolicyId().equals(null)|| policy.getPolicyName().equals(null) || policy.getTypeOfPolicy().equals(null)
				|| policy.getPolicyOwner().equals(null) || policy.getPolicyTime().equals(null)
				|| policy.getPolicyDate().equals(null) || policy.getPolicyAmount().equals(null)) {
			model.addAttribute("error", "Please enter all the fields");
			return "policyRegisteration";
		}
		model.addAttribute("success", "Successfully Created Policy");
		return "adminPage";
	}

	@GetMapping("/policy")
	public String getEdit() {
		return "policy";
	}

	@PostMapping("/policyEdit")
	public String getEdit(@RequestParam("policyId") Integer policyId, Model model) {
		Policy policyform = policyService.getPolicy(policyId);
		model.addAttribute("policy", policyform);
		return "policyEdit";
	}

	@PostMapping("/policyeditform")
	public String postEdit(@RequestParam("policyName") String policyName,
			@RequestParam("policyOwner") String policyOwner, @RequestParam("typeOfPolicy") String typeOfPolicy,
			@RequestParam("policyTime") String policyTime, @RequestParam("policyDate") Date policyDate,
			@RequestParam("policyAmount") int policyAmount, Model model, @ModelAttribute("policy") Policy policy) {

		policy.setPolicyName(policyName);
		policy.setTypeOfPolicy(typeOfPolicy);
		policy.setPolicyOwner(policyOwner);
		policy.setPolicyTime(policyTime);
		policy.setPolicyDate(policyDate);
		policy.setPolicyAmount(policyAmount);
		policyService.editPolicy(policy);
		return "adminPage";
	}

}
