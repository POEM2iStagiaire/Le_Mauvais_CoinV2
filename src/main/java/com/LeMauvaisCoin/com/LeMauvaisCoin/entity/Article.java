package com.LeMauvaisCoin.com.LeMauvaisCoin.entity;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import com.github.javafaker.Faker;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Entity @Table
@Getter @Setter  @AllArgsConstructor @ToString
public class Article {

	@Id @GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	private String description;
	private String brand;
	private double price;
	
	@OneToMany(targetEntity = CommandLine.class, mappedBy = "article")
	private List <CommandLine> commandLine = new ArrayList<>();


	public Article() {
		Faker f = new Faker();
		this.description = f.lorem().characters(100);
		this.brand = f.company().name();
		this.price = f.number().randomDouble(2, 10, 10000);		
	}
	
	
}
