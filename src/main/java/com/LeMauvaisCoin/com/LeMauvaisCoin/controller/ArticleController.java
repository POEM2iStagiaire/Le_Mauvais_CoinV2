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

import com.LeMauvaisCoin.com.LeMauvaisCoin.entity.Article;
import com.LeMauvaisCoin.com.LeMauvaisCoin.entity.CommandLine;
import com.LeMauvaisCoin.com.LeMauvaisCoin.service.ArticleService;
import com.LeMauvaisCoin.com.LeMauvaisCoin.service.CommandLineService;

@RestController
@RequestMapping("/article")
public class ArticleController {
	
	@Autowired
	ArticleService aService;
	@Autowired
	CommandLineService clService;

	@GetMapping("/fake/{nbCommandLine}")
	private Article fakeArticle(@PathVariable("nbCommandLine")int nbCommandLine) {
		Article a = new Article();
		aService.createArticle(a);
		for (int i =0 ; i<nbCommandLine ; i++) {
			CommandLine cl = new CommandLine(a);
			clService.createCommandLine(cl);
			a.getCommandLine().add(cl);
		}
		aService.updateArticle(a.getId(),a);
		return a;
	}
	
	
	@GetMapping
	private List<Article> getAllArticle(){
		return aService.getAllArticle();
	}
	
	@GetMapping("/{id}")
	private Article getOneArticle(@PathVariable("id") int id ){
		return aService.getArticleById(id);
	}
	
	@PostMapping
	private void postArticle(@RequestBody Article a) {
		aService.createArticle(a);
	}
	
	@PutMapping("/{id}")
	private void putArticle(@RequestBody Article a, @PathVariable("id") int id) {
		aService.updateArticle(id, a);
	}
	
	@DeleteMapping("/{id}")
	private void deleteArticle(@PathVariable("id") int id) {
		aService.deleteArticle(id);
	}
}
