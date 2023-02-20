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


import com.LeMauvaisCoin.com.LeMauvaisCoin.entity.UserInformation;
import com.LeMauvaisCoin.com.LeMauvaisCoin.service.UserInformationService;
@RestController
@RequestMapping("/userinformation")
public class UserInformationController {
	@Autowired
	UserInformationService uiService;
	
	@GetMapping("/fake")
	public UserInformation fakeUserInformation(){
		UserInformation ui = new UserInformation();
		uiService.createUserInformation(ui);
		return ui;
	}
	
	@GetMapping("/{id}")
	public UserInformation getUserInformationById(@PathVariable("id") int idIn) {
		return uiService.getUserInformationById(idIn);
	}
	
	@GetMapping
	public List<UserInformation> getAllUserInformation(){
		return uiService.getAllUserInformation();
	}
	
	@PostMapping
	public void postUserInformation(@RequestBody UserInformation ui) {
		uiService.createUserInformation(ui);
	}
	
	@PutMapping("/{id}")
	public void updateUserInformation(@PathVariable("id") int idIn, @RequestBody UserInformation ui) {
		uiService.updateUserInformation(idIn, ui);
	}
	
	@DeleteMapping("/{id}")
	public void deleteUserInformation(@PathVariable("id") int idIn) {
		uiService.deleteUserInformation(idIn);
	}
}
