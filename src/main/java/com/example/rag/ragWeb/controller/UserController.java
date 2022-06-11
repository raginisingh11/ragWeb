package com.example.rag.ragWeb.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.rag.ragWeb.domain.User;
import com.example.rag.ragWeb.service.UserService;

@RestController
public class UserController {
	
	

	@Autowired
	UserService userSrv;

	/*
	 * @GetMapping("/user")
	 * 
	 * public User getUser(@RequestParam int userId) {
	 * 
	 * User usr = null; usr = userSrv.getUsers(userId);
	 * 
	 * return usr;
	 * 
	 * }
	 */

	@GetMapping("/user/{userId}")

	public User getUser(@PathVariable int userId) {

		User usr = userSrv.getUsers(userId);

		return usr;

	}
	@GetMapping("/worker/{skillname}")

	public User getworkersbyskillname(@PathVariable int userId) {

		User usr = userSrv.getUsers(userId);

		return usr;

	}
	@GetMapping("/user/byname/{name}")

	public List<User> getUser(@PathVariable String name) {

		List<User> usr = null;

		usr = userSrv.getUsersByName(name);
		

		return usr;

	}

	@GetMapping("/user")
	public List<User> getAllUsers() {

		List<User> usr = null;

		usr = userSrv.getAllUsers();

		return usr;

	}

	@PostMapping("/user")
	public User createUser(@RequestBody User userObj) {

		return userSrv.createUser(userObj);

	}

	@PutMapping("/user")
	User replaceUser(@RequestBody User newUser) {

		return userSrv.replaceUser(newUser);

	}

	@DeleteMapping("/user/{id}")
	public void deleteUser(@PathVariable long id) {
		userSrv.deleteUser(id);
	}

}
