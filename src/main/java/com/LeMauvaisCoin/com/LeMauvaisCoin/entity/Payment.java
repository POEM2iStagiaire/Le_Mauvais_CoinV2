package com.LeMauvaisCoin.com.LeMauvaisCoin.entity;

import java.sql.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import com.github.javafaker.Faker;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Entity
@Table(name="payment")
@Getter @Setter  @AllArgsConstructor @ToString
@Inheritance( strategy = InheritanceType.TABLE_PER_CLASS )
public abstract class Payment {
	
	@Id @GeneratedValue(strategy = GenerationType.SEQUENCE)
	private int id;
	
	private int amount;
	private java.util.Date paymentDate;

	@OneToOne @JoinColumn(name="id_command")
	//@Column(name="")
	private Command command;

	
	
	public Payment() {
	Faker f = new Faker();
	

	this.amount  = f.number().numberBetween(1, 50000);
	this.paymentDate = f.date().birthday();
	}
}
