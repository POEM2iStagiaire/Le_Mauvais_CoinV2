package com.LeMauvaisCoin.com.LeMauvaisCoin.entity;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import com.github.javafaker.Faker;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Entity @Table
@Getter @Setter @AllArgsConstructor @ToString
public class Command {

	@Id @GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	
	private Date commandDate;
	
	@OneToMany(targetEntity = CommandLine.class, mappedBy = "command")
	private List <CommandLine> commandLine = new ArrayList<>();
	
	@ManyToOne @JoinColumn(name="id_user")
	private User user;
	
	@OneToOne @JoinColumn(name="id_payment")
	private Payment payment;
	
	public Command() {
		Faker f = new Faker();
		this.commandDate = f.date().birthday();
	}
}
