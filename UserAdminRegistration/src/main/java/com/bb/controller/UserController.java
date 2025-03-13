package com.bb.controller;


import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.bb.entity.BloodAvailability;
import com.bb.entity.User;
import com.bb.exception.InvalidException;
import com.bb.service.UserService;

@RestController
@CrossOrigin(origins = "http://localhost:4200")
public class UserController {
	
	@Autowired
	private UserService userService;
		
	@PostMapping("/registeruser")
	public User registerUser(@Valid @RequestBody User user) throws Exception {
		String tempUserEmail=user.getUserEmail();
		if(tempUserEmail!=null && !"".equals(tempUserEmail)) {
			User userObj=userService.getUserByEmail(tempUserEmail);
			if(userObj!=null) {
				throw new Exception("User with "+tempUserEmail+" is already exist");
			}
		}
		User userObj=null;
		userObj=userService.saveUser(user);
		return userObj;
	}
	
	@PostMapping("/loginuser")
	public User loginUser(@RequestBody User user) throws InvalidException {
		String tempUserEmail=user.getUserEmail();
		String tempUserPassword=user.getUserPassword();
		User userObj=null;
		if(tempUserEmail!=null && tempUserPassword!=null) {
			userObj=userService.getUserByEmailAndPassword(tempUserEmail,tempUserPassword);
		}
		if(userObj==null) {
			throw new InvalidException("Invalid Credentials");
		}
		return userObj;
	}

	@GetMapping("user/bloodavailable/{id}")
	public BloodAvailability getBloodAvailabilityByIdFromUser(@PathVariable ("id") int baId) {
		return userService.getBloodAvailabilityByIdFromUser(baId);
	}
	
	@GetMapping("user/bloodavailable/getallbloodavailable")
	public List<BloodAvailability> getAllBloodAvailabilityFromUser(){
		return userService.getAllBloodAvailableFromUser();
	}
	
	
}
