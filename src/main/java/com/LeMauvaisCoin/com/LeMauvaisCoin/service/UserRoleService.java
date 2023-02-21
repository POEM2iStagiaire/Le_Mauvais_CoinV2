package com.LeMauvaisCoin.com.LeMauvaisCoin.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.LeMauvaisCoin.com.LeMauvaisCoin.entity.UserRole;
import com.LeMauvaisCoin.com.LeMauvaisCoin.repository.UserRoleRepository;

@Service
public class UserRoleService {

	@Autowired
	UserRoleRepository repo;
	
	public UserRole getUserRoleById(int idIn) {
		return repo.findById(idIn).orElse(null);
	}
	
	
	public List<UserRole> getAllUserRole(){
		return repo.findAll();
	}
	
	
	public void deleteUserRole(int idIn) {
		UserRole ur = repo.findById(idIn).orElse(null);
		if (ur!=null) {
			repo.delete(ur);
		}
	}
	
	public void createUserUserRole(UserRole ur) {
		repo.save(ur);
	}
	
	
	public void updateUserUserRole(int idIn, UserRole ur) {
		UserRole userRoleInDB = repo.findById(idIn).orElse(null);
		if(ur!=null) {
			userRoleInDB.setIdUser(ur.getIdUser());
			userRoleInDB.setIdRole(ur.getIdRole());
			
			repo.save(userRoleInDB);
		}
		
	}
	
}
