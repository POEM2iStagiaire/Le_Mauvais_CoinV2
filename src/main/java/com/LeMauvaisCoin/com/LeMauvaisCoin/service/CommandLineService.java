package com.LeMauvaisCoin.com.LeMauvaisCoin.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.LeMauvaisCoin.com.LeMauvaisCoin.entity.CommandLine;
import com.LeMauvaisCoin.com.LeMauvaisCoin.repository.CommandLineRepository;

@Service
public class CommandLineService {

	@Autowired
	CommandLineRepository repo;
	
	public void createCommandLine(CommandLine a) {
		repo.save(a);
	}
	
	public void updateCommandLine (int id,CommandLine a) {
		CommandLine commandLine = repo.findById(id).orElse(null);
		if (a!=null) {
			commandLine.setQuantity(a.getQuantity());
			commandLine.setCommand(a.getCommand());
			commandLine.setArticle(a.getArticle());
			repo.save(commandLine);
		}
	}
		
	public void deleteCommandLine(int id) {
		CommandLine commandLine = repo.findById(id).orElse(null);
		if (commandLine!= null) {
			repo.delete(commandLine);
		}
	}
	
	public List<CommandLine> getAllCommandLine() {
		return repo.findAll();
	} 
	
	public CommandLine getCommandLineById(int id) {
		return repo.findById(id).orElse(null);
	}
	
}
