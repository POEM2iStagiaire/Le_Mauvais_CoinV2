package com.LeMauvaisCoin.com.LeMauvaisCoin.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.LeMauvaisCoin.com.LeMauvaisCoin.entity.User;
import com.LeMauvaisCoin.com.LeMauvaisCoin.repository.UserRepository;


@Service
public class UserService {
	@Autowired
	UserRepository repo;
	
	public User getUserById(int idIn) {
		return repo.findById(idIn).orElse(null);
	}
	
	
	public List<User> getAllUser(){
		return repo.findAll();
	}
	
	
	public void deleteUser(int idIn) {
		User u = repo.findById(idIn).orElse(null);
		if (u!=null) {
			repo.delete(u);
		}
	}
	
	public User createUser(User u) {
		return repo.save(u);
	}
	
	
	public void updateUser(int idIn, User u) {
		User userInDB = repo.findById(idIn).orElse(null);
		if(u!=null) {
			userInDB.setLogin(u.getLogin());
			userInDB.setPassword(u.getPassword());
			userInDB.setConnectionNumber(u.getConnectionNumber());
			userInDB.setRoles(u.getRoles());
			userInDB.setUserInformation(u.getUserInformation());
			userInDB.setCommands(u.getCommands());
			repo.save(userInDB);
		}
		
	}
		
}
