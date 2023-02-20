package com.LeMauvaisCoin.com.LeMauvaisCoin.entity;

import java.sql.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Entity
@Table
@Getter @Setter @NoArgsConstructor @AllArgsConstructor @ToString
public abstract class Payment {

	@Id @GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	
	private int amount;
	private Date paymentDate;

	@OneToOne(targetEntity=Command.class, mappedBy="payment")
	//@Column(name="")
	private Command command;
	
	
}
