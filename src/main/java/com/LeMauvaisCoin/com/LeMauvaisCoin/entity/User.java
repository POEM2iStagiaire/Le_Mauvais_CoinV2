package com.LeMauvaisCoin.com.LeMauvaisCoin.entity;

import java.util.List;


import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name="users")
@Getter @Setter @NoArgsConstructor @AllArgsConstructor
public class User {
	@Id @GeneratedValue(strategy=GenerationType.IDENTITY)
	private int id;
	private String login;
	private String password;
	//@Column(name="connection_number")
	private int connectionNumber;
	
	
	@ManyToMany
	@JoinTable( name = "user_role",
    			joinColumns = @JoinColumn( name = "idUser" ),
    			inverseJoinColumns = @JoinColumn( name = "idRole" ) )
	private List<Role> roles;
	
	
	@OneToOne(targetEntity=UserInformation.class, mappedBy="user")
	//@Column(name="id_user_information")
	private UserInformation userInformation;
	
	@OneToMany(targetEntity=Command.class, mappedBy="user")
	private List<Command> commands;
}


