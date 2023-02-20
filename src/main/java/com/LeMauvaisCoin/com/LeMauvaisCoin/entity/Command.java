package com.LeMauvaisCoin.com.LeMauvaisCoin.entity;

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

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Entity @Table
@Getter @Setter @NoArgsConstructor @AllArgsConstructor @ToString
public class Command {

	@Id @GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	
	private Date commandDate;
	
	@OneToMany(targetEntity = CommandLine.class, mappedBy = "command")
	private List <CommandLine> commandLine;
	
	@ManyToOne @JoinColumn(name="id_user")
	private User user;
	
	@OneToOne(targetEntity=Payment.class, mappedBy="id_payment")
	//@Column(name="")
	private Payment payment;
}
