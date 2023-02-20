package com.LeMauvaisCoin.com.LeMauvaisCoin.entity;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnore;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table//(name="roles")
@Getter @Setter @NoArgsConstructor @AllArgsConstructor
public class Role {
	@Id @GeneratedValue(strategy=GenerationType.IDENTITY)
	private int id;
	//@Column(name="role_name")
	private String roleName;
	
	
	@ManyToMany
	@JsonIgnore
	@JoinTable( name = "user_role",
    			joinColumns = @JoinColumn( name = "id_role" ),
    			inverseJoinColumns = @JoinColumn( name = "id_user" ) )
	private List<User> users;
	
	
}


