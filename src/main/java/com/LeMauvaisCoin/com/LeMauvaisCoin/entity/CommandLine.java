package com.LeMauvaisCoin.com.LeMauvaisCoin.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.github.javafaker.Faker;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Entity @Table
@Getter @Setter @NoArgsConstructor @ToString
public class CommandLine {

	@Id @GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id ;
	
	private int quantity;
	
	@ManyToOne @JoinColumn(name="id_command")
	@JsonIgnore
	private Command command;
	
	@ManyToOne @JoinColumn(name="id_article")
	@JsonIgnore
	private Article article;
	
	public CommandLine (Article a) {
		Faker f = new Faker();
		this.quantity=f.number().numberBetween(1, 10000);
		this.article = a; 
	}
	
	public CommandLine (Command c) {
		Faker f = new Faker();
		this.quantity=f.number().numberBetween(1, 10000);
		this.command = c; 
	}
	
	
}

