package com.LeMauvaisCoin.com.LeMauvaisCoin.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import com.github.javafaker.Faker;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
@Entity
@Table//(name="user_informations")
@Getter @Setter @NoArgsConstructor @AllArgsConstructor
public class UserInformation {
	@Id @GeneratedValue(strategy=GenerationType.IDENTITY)
	private int id;
	private String addresse;
	private String city;
	private String email;
	//@Column(name="phone_number")
	private int phoneNumber;
	
	
	@OneToOne @JoinColumn(name="id_user")
	//@Column(name="id_user")
	private User user;


	public UserInformation(String addresse, String city, String email, int phoneNumber) {
		Faker f = new Faker();
		this.addresse = f.address().buildingNumber();
		this.city = f.address().city();
		this.email = f.internet().safeEmailAddress();
		this.phoneNumber = f.number().numberBetween(0, 9999999);
	}
	
	
	
}




