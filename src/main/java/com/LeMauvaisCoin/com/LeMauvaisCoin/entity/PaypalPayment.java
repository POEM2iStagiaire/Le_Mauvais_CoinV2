package com.LeMauvaisCoin.com.LeMauvaisCoin.entity;

import javax.persistence.Entity;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Entity
@Table
@Getter @Setter @NoArgsConstructor @AllArgsConstructor @ToString
public class PaypalPayment extends Payment {

	private String accountNumber;

	
	
}
