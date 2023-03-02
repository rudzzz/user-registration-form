package com.registration.form.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.registration.form.entity.User;
import com.registration.form.repository.UserRepository;

@Controller
public class UserController {
	
	@Autowired
	private UserRepository userRepository;
	
	@GetMapping("/")
	public String home() {
		return "index";
	}
	@PostMapping("/register")
	public String register(@ModelAttribute User user) {
		System.out.println(user);
		userRepository.save(user);
		return "redirect:/";
	}
}
