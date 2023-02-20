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

import com.LeMauvaisCoin.com.LeMauvaisCoin.entity.Role;
import com.LeMauvaisCoin.com.LeMauvaisCoin.entity.User;
import com.LeMauvaisCoin.com.LeMauvaisCoin.service.RoleService;
@RestController
@RequestMapping("/role")
public class RoleController {
	@Autowired
	RoleService rService;
	
	@GetMapping("/fake")
	public Role fakeRole(){
		Role r = new Role();
		rService.createRole(r);
		return r;
	}
	
	@GetMapping("/{id}")
	public Role getRoleById(@PathVariable("id") int idIn) {
		return rService.getRoleById(idIn);
	}
	
	@GetMapping
	public List<Role> getAllRole(){
		return rService.getAllRole();
	}
	
	@PostMapping
	public void postRole(@RequestBody Role r) {
		rService.createRole(r);
	}
	
	@PutMapping("/{id}")
	public void updateRole(@PathVariable("id") int idIn, @RequestBody Role r) {
		rService.updateRole(idIn, r);
	}
	
	@DeleteMapping("/{id}")
	public void deleteRole(@PathVariable("id") int idIn) {
		rService.deleteRole(idIn);
	}
}
