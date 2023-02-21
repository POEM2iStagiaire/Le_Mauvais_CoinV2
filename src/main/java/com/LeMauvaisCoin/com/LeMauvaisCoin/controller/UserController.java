package com.LeMauvaisCoin.com.LeMauvaisCoin.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.LeMauvaisCoin.com.LeMauvaisCoin.entity.User;
import com.LeMauvaisCoin.com.LeMauvaisCoin.service.RoleService;
import com.LeMauvaisCoin.com.LeMauvaisCoin.service.UserService;

@RestController
@RequestMapping("/user")
public class UserController {
	@Autowired
	UserService uService;
	RoleService rService;
	
	@GetMapping("/fake")
	public User fakeUser(){
		User u = new User();
		uService.createUser(u);
		return u;
	}
	
	
	@GetMapping("/{id}")
	public User getUserById(@PathVariable("id") int idIn) {
		return uService.getUserById(idIn);
	}
	
	@GetMapping
	public List<User> getAllUser(){
		return uService.getAllUser();
	}
	
	@PostMapping
	public void postUser(@RequestBody User u) {
		uService.createUser(u);
	}
	
	@PutMapping("/{id}")
	public void updateUser(@PathVariable("id") int idIn, @RequestBody User u) {
		uService.updateUser(idIn, u);
	}
	
	@DeleteMapping("/{id}")
	public void deleteUser(@PathVariable("id") int idIn) {
		uService.deleteUser(idIn);
	}
}
