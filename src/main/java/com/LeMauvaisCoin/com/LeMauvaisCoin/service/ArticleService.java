package com.LeMauvaisCoin.com.LeMauvaisCoin.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.LeMauvaisCoin.com.LeMauvaisCoin.entity.Article;
import com.LeMauvaisCoin.com.LeMauvaisCoin.repository.ArticleRepository;

@Service
public class ArticleService {

	@Autowired 
	ArticleRepository repo;
	
	public void createArticle(Article a) {
		repo.save(a);
	}
	
	public void updateArticle (int id,Article a) {
		Article article = repo.findById(id).orElse(null);
		if (a!=null) {
			article.setDescription(a.getDescription());
			article.setBrand(a.getBrand());
			article.setPrice(a.getPrice());
			repo.save(article);
		}
	}
		
	public void deleteArticle(int id) {
		Article article = repo.findById(id).orElse(null);
		if (article!= null) {
			repo.delete(article);
		}
	}
	
	public List<Article> getAllArticle() {
		return repo.findAll();
	} 
	
	public Article getArticleById(int id) {
		return repo.findById(id).orElse(null);
	}
		
	
	
}
