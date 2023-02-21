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


import com.LeMauvaisCoin.com.LeMauvaisCoin.entity.UserRole;
import com.LeMauvaisCoin.com.LeMauvaisCoin.service.UserRoleService;

@RestController
@RequestMapping("/userrole")
public class UserRoleController {
	@Autowired
	UserRoleService urService;
	
		
	@GetMapping("/{id}")
	public UserRole getUserByIdUserRole(@PathVariable("id") int idIn) {
		return urService.getUserRoleById(idIn);
	}
	
	@GetMapping
	public List<UserRole> getAllUserRole(){
		return urService.getAllUserRole();
	}
	
	@PostMapping
	public void postUserRole(@RequestBody UserRole u) {
		urService.createUserUserRole(u);
	}
	
	@PutMapping("/{id}")
	public void updateUserRole(@PathVariable("id") int idIn, @RequestBody UserRole u) {
		urService.updateUserUserRole(idIn, u);
	}
	
	@DeleteMapping("/{id}")
	public void deleteUserRole(@PathVariable("id") int idIn) {
		urService.deleteUserRole(idIn);
	}
}
