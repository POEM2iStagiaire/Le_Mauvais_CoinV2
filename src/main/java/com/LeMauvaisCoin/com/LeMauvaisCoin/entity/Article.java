package com.LeMauvaisCoin.com.LeMauvaisCoin.entity;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Getter @Setter @NoArgsConstructor @AllArgsConstructor @ToString
public class Article {

	@Id @GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	private String description;
	private String brand;
	private double price;
}
