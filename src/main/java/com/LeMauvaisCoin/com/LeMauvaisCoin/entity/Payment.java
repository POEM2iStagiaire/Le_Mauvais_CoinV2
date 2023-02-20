package com.LeMauvaisCoin.com.LeMauvaisCoin.entity;

import java.sql.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Entity @Getter @Setter @AllArgsConstructor @ToString
public class Payment {

	@Id @GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	
	private int amount;
	private Date paymentDate;
	
	
}
