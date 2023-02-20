package com.LeMauvaisCoin.com.LeMauvaisCoin.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.LeMauvaisCoin.com.LeMauvaisCoin.entity.UserInformation;

public interface UserInformationRepository extends JpaRepository<UserInformation, Integer> {

}
