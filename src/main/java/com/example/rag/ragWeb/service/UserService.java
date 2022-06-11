package com.example.rag.ragWeb.service;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.rag.ragWeb.domain.User;
import com.example.rag.ragWeb.repository.UserRepository;
import com.google.common.collect.Lists;

@Service
public class UserService {

	@Autowired
	UserRepository userRepositoryObj;

	public User getUsers(int testId) {

		User userObj = userRepositoryObj.findById(Long.valueOf(testId)).get();

		return userObj;
	}

	public List<User> getUsersByName(String userName) {

		List<User> userObj = userRepositoryObj.findByName(userName); 
		
		//userObj.forEach(user -> System.out.println(user));

		return userObj;
	}

	public List<User> getAllUsers() {
		
		List<User> userObj = new ArrayList();
			
		for(User user : userRepositoryObj.findAll()) {
			
			userObj.add(user);
			
		}
					
		// userRepositoryObj.findAll().forEach(user -> userObj.add(user));	
		
		// List<User> userObj = Lists.newArrayList(userRepositoryObj.findAll());
		 		
		
		return userObj;

	}

	public User createUser(User userObj) {

		User newUser = userRepositoryObj.save(userObj);

		return newUser;
	}

	public User replaceUser(User newUser) {

		// Get User from database using id
		User oldUser = userRepositoryObj.findById(Long.valueOf(newUser.getId())).get();

		// Update the java object
		oldUser.setEmail(newUser.getEmail());
		
		oldUser.name = newUser.name;

		// Save java object in the database
		return userRepositoryObj.save(oldUser);

	}
	public void deleteUser(Long id) {

		   userRepositoryObj.deleteById(Long.valueOf(id)); 

	}
	
	/*
	 * public User newReplaceUser(User newUser, Long id) {
	 * 
	 * return (User) userRepositoryObj.findById(id).map(oldUser -> {
	 * oldUser.setEmail(newUser.getEmail()); oldUser.name=newUser.name; return
	 * userRepositoryObj.save(oldUser); }).orElseGet(() -> { return
	 * userRepositoryObj.save(newUser); });
	 * 
	 * }
	 */
	 

}
