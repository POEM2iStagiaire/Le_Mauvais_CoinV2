package com.LeMauvaisCoin.com.LeMauvaisCoin.entity;

import javax.persistence.Entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Entity @Getter @Setter @AllArgsConstructor @ToString
public class PaypalPayment extends Payment {

	private String accountNumber;

	
	
}
