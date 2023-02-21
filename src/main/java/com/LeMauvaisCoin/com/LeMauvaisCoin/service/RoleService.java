package com.LeMauvaisCoin.com.LeMauvaisCoin.service;

import java.util.List;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.LeMauvaisCoin.com.LeMauvaisCoin.entity.Role;
import com.LeMauvaisCoin.com.LeMauvaisCoin.repository.RoleRepository;


@Service //défini la classe comme un service
public class RoleService {
	@Autowired
	RoleRepository repo;
	
	public Role getRoleById(int idIn) {				
		return repo.findById(idIn).orElse(null);	
	}
	
	
	public List<Role> getAllRole(){
		return repo.findAll();
	}
	
	
	public void deleteRole(int idIn) {
		Role r = repo.findById(idIn).orElse(null);
		if (r!=null) {
			repo.delete(r);
		}
	}
	
	public void createRole(Role r) {
		repo.save(r);
	}
	
	
	public void updateRole(int idIn, Role r) {
		Role roleInDB = repo.findById(idIn).orElse(null);
		if(r!=null) {
			roleInDB.setRoleName(r.getRoleName());
			roleInDB.setUsers(r.getUsers());
			repo.save(roleInDB);
		}
	}
		
}
