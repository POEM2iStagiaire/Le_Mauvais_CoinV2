package com.LeMauvaisCoin.com.LeMauvaisCoin.entity;

import javax.persistence.Entity;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Entity
@Inheritance( strategy = InheritanceType.TABLE_PER_CLASS )
@Table(name="ccpayment")
@Getter @Setter @NoArgsConstructor @AllArgsConstructor @ToString
public class CreditCardPayment extends Payment {
	
	private String cardNumber;
	private String expirationDate;
	
	

}
