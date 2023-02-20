package com.LeMauvaisCoin.com.LeMauvaisCoin.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.LeMauvaisCoin.com.LeMauvaisCoin.entity.Command;
import com.LeMauvaisCoin.com.LeMauvaisCoin.repository.CommandRepository;

@Service
public class CommandService {

	@Autowired
	CommandRepository repo;
	
	public void createCommand(Command a) {
		repo.save(a);
	}
	
	public void updateCommand (int id,Command c) {
		Command command = repo.findById(id).orElse(null);
		if (c!=null) {
			command.setCommandDate(c.getCommandDate());
			command.setCommandLine(c.getCommandLine());
			command.setUser(c.getUser());
			command.setPayment(c.getPayment());
			repo.save(command);
		}
	}
		
	public void deleteCommand(int id) {
		Command command = repo.findById(id).orElse(null);
		if (command!= null) {
			repo.delete(command);
		}
	}
	
	public List<Command> getAllCommand() {
		return repo.findAll();
	} 
	
	public Command getCommandById(int id) {
		return repo.findById(id).orElse(null);
	}
	
	
}
