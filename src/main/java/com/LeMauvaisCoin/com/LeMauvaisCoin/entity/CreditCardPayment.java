package com.LeMauvaisCoin.com.LeMauvaisCoin.entity;

import javax.persistence.Entity;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Entity
@Table
@Getter @Setter @AllArgsConstructor @ToString
public class CreditCardPayment extends Payment {
	
	private String cardNumber;
	private String expirationDate;
	
	

}
