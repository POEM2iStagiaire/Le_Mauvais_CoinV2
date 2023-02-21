package com.LeMauvaisCoin.com.LeMauvaisCoin.entity;

import javax.persistence.Entity;
import javax.persistence.Table;

import com.github.javafaker.Faker;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Entity
@Table
@Getter @Setter  @AllArgsConstructor @ToString
public class PaypalPayment extends Payment {

	private int accountNumber;

	
		
	public PaypalPayment() {
		super();
		Faker f = new Faker();
		this.accountNumber=f.number().numberBetween(1, 50000);
		
		
	}
	
}
