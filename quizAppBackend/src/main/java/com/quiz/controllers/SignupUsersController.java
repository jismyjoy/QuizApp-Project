package com.quiz.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.quiz.entities.SignupUsers;

@RestController
@CrossOrigin
public class SignupUsersController {
	
	@Autowired
	SignupUsersRepository signupUsersRepository;
	
	@RequestMapping(path="/login",method= RequestMethod.GET)
	public List<SignupUsers>fetchAllUsers(){
		return signupUsersRepository.findAll();
	}
	
	@RequestMapping(path="/login",method= RequestMethod.POST)
	public SignupUsers addUser(@RequestBody SignupUsers signupUsers) {
		return signupUsersRepository.save(signupUsers);
	}

}
