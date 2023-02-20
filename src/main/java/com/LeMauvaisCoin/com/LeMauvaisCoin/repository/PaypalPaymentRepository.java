package com.LeMauvaisCoin.com.LeMauvaisCoin.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.LeMauvaisCoin.com.LeMauvaisCoin.entity.PaypalPayment;

public interface PaypalPaymentRepository extends JpaRepository<PaypalPayment, Integer> {

}
