package com.LeMauvaisCoin.com.LeMauvaisCoin.entity;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.Table;

import com.github.javafaker.Faker;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Entity
@Inheritance( strategy = InheritanceType.TABLE_PER_CLASS )
@Table(name="ccpayment")
@Getter @Setter  @AllArgsConstructor @ToString
public class CreditCardPayment extends Payment {
	
	private int cardNumber;
	private Date expirationDate;
	

	
	public CreditCardPayment() {
		super();
		Faker f = new Faker();
		this.cardNumber=f.number().numberBetween(1, 50000);
		this.expirationDate=f.date().birthday();
		
	}

}
