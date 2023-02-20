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

import com.LeMauvaisCoin.com.LeMauvaisCoin.entity.Command;
import com.LeMauvaisCoin.com.LeMauvaisCoin.service.CommandService;

@RestController
@RequestMapping("/command")
public class CommandController {

	@Autowired
	CommandService cService;

	@GetMapping
	private List<Command> getAllCommand(){
		return cService.getAllCommand();
	}
	
	@GetMapping("/{id}")
	private Command getOneCommand(@PathVariable("id") int id ){
		return cService.getCommandById(id);
	}
	
	@PostMapping
	private void postCommand(@RequestBody Command c) {
		cService.createCommand(c);
	}
	
	@PutMapping("/{id}")
	private void putCommand(@RequestBody Command c, @PathVariable("id") int id) {
		cService.updateCommand(id, c);
	}
	
	@DeleteMapping("/{id}")
	private void deleteCommand(@PathVariable("id") int id) {
		cService.deleteCommand(id);
	}
}
