package org.hcl.controller;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.hcl.entities.User;
import org.hcl.service.UserService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller

public class UserController {
	@Resource
	UserService service;

	@GetMapping("/userLogin")
	public String showLogin(Model model) {
		return "userLogin";
	}

	@GetMapping("/userRegistration")
	public String showUserReg(Model model) {
		return "userRegistration";
	}

	@PostMapping("/userform")
	public String showRegister(@RequestParam("firstName") String firstname, @RequestParam("lastName") String lastname,
			@RequestParam("age") int age, @RequestParam("gender") String gender,
			@RequestParam("contactno") String contactno, @RequestParam("userId") String userid,
			@RequestParam("password") String password, Model model) {
		User user = new User();
		user.setFirstName(firstname);
		user.setLastName(lastname);
		user.setAge(age);
		user.setGender(gender);
		user.setContactno(contactno);
		user.setUserId(userid);
		user.setPassword(password);
		service.insert(user);

		if (user.getFirstName().equals(null) || user.getLastName().equals(null) || user.getAge() == 0
				|| user.getGender().equals(null) || user.getContactno().equals(null) || user.getUserId().equals(null)
				|| user.getPassword().equals(null)) {
			model.addAttribute("error", "Please fill required fields");
			return "userLogin";
		}

		model.addAttribute("error", "successful Registeration");
		return "userRegistration";

	}

	@PostMapping("/usersubmit")
	public String validate(@RequestParam("userId") String userId, @RequestParam("password") String password,
			Model model, HttpSession session, HttpServletRequest request) {

		boolean valid = service.login(userId, password);
		if (valid) {
			model.addAttribute("success", userId);
			session.setAttribute("userId", userId);
			return "usersearch";
		}
		model.addAttribute("error", "invalid username or password");
		return "user";
	}

}
