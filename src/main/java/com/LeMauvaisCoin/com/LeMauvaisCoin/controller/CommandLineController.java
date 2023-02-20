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

import com.LeMauvaisCoin.com.LeMauvaisCoin.entity.CommandLine;
import com.LeMauvaisCoin.com.LeMauvaisCoin.service.CommandLineService;

@RestController
@RequestMapping("/commandline")
public class CommandLineController {

	@Autowired
	CommandLineService clService;

	@GetMapping
	private List<CommandLine> getAllCommandLine(){
		return clService.getAllCommandLine();
	}
	
	@GetMapping("/{id}")
	private CommandLine getOneCommandLine(@PathVariable("id") int id ){
		return clService.getCommandLineById(id);
	}
	
	@PostMapping
	private void postCommandLine(@RequestBody CommandLine c) {
		clService.createCommandLine(c);
	}
	
	@PutMapping("/{id}")
	private void putCommandLine(@RequestBody CommandLine c, @PathVariable("id") int id) {
		clService.updateCommandLine(id, c);
	}
	
	@DeleteMapping("/{id}")
	private void deleteCommandLine(@PathVariable("id") int id) {
		clService.deleteCommandLine(id);
	}
}