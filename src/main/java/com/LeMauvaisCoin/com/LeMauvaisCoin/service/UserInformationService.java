package com.LeMauvaisCoin.com.LeMauvaisCoin.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.LeMauvaisCoin.com.LeMauvaisCoin.entity.UserInformation;
import com.LeMauvaisCoin.com.LeMauvaisCoin.repository.UserInformationRepository;


@Service
public class UserInformationService {
	@Autowired
	UserInformationRepository repo;
	
	public UserInformation getUserInformationById(int idIn) {
		return repo.findById(idIn).orElse(null);
	}
	
	
	public List<UserInformation> getAllUserInformation(){
		return repo.findAll();
	}
	
	
	public void deleteUserInformation(int idIn) {
		UserInformation ui = repo.findById(idIn).orElse(null);
		if (ui!=null) {
			repo.delete(ui);
		}
	}
	
	public void createUserInformation(UserInformation ui) {
		repo.save(ui);
	}
	
	
	public void updateUserInformation(int idIn, UserInformation ui) {
		UserInformation userInformationInDB = repo.findById(idIn).orElse(null);
		if(ui!=null) {
			userInformationInDB.setAddresse(ui.getAddresse());
			userInformationInDB.setCity(ui.getCity());
			userInformationInDB.setEmail(ui.getEmail());
			userInformationInDB.setPhoneNumber(ui.getPhoneNumber());
			userInformationInDB.setUser(ui.getUser());
			repo.save(userInformationInDB);
		}
	}
		
	
	
	
	
	
	
}
