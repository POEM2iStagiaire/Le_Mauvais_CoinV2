package com.LeMauvaisCoin.com.LeMauvaisCoin.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.LeMauvaisCoin.com.LeMauvaisCoin.entity.Command;

public interface CommandRepository extends JpaRepository<Command, Integer> {

}
