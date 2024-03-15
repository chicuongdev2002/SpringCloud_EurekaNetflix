package iuh.spring.user.controller;

import iuh.spring.user.entity.User;
import iuh.spring.user.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/v1")
public class UserController {
	@Autowired
	private UserRepository userRepository;
	@GetMapping("/user")
	public String getHello() {
		return "User nha";
	}
	@GetMapping("/user/all")
	public List<User> getAllUser(){
		List<User> all = userRepository.findAll();
		return all;

	}
}
