package com.LeMauvaisCoin.com.LeMauvaisCoin.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.LeMauvaisCoin.com.LeMauvaisCoin.entity.Payment;

public interface PaymentRepository extends JpaRepository<Payment, Integer> {

}
