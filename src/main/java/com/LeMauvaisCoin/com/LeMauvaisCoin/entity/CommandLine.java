package com.LeMauvaisCoin.com.LeMauvaisCoin.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity @Table
@Getter @Setter @NoArgsConstructor @AllArgsConstructor
public class CommandLine {

	@Id @GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id ;
	private int quantity;
	
	@ManyToOne @JoinColumn(name="id_command")
	private Command command;
	
	
	@ManyToOne @JoinColumn(name="id_commandLine")
	private Article article;
}

