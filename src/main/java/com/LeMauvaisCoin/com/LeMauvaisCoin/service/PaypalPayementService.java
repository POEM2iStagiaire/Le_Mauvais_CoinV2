package com.LeMauvaisCoin.com.LeMauvaisCoin.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.LeMauvaisCoin.com.LeMauvaisCoin.entity.PaypalPayment;
import com.LeMauvaisCoin.com.LeMauvaisCoin.repository.CreditCardPaymentRepository;
import com.LeMauvaisCoin.com.LeMauvaisCoin.repository.PaypalPaymentRepository;

@Service
public class PaypalPayementService {

	@Autowired
	PaypalPaymentRepository reposit;
	
	
	public void createPaypalPayement(PaypalPayment pp) { //pp=paypalpayment
		reposit.save(pp);
	}
	

	public PaypalPayment getByIdPaypalPayement(int id) {
		return reposit.findById(id).orElse(null);
	}
	

	public List<PaypalPayment> getAllPaypalPayement() {
		return reposit.findAll();
	}

	
	public void updateCreditPaypalPayement(int id, PaypalPayment pp) {
		PaypalPayment ppaymentIn = reposit.findById(id).orElse(null);
		if (pp!= null) {
			ppaymentIn.setAccountNumber( pp.getAccountNumber() );
			reposit.save(ppaymentIn);
		}
	}

	public void deleteCreditPaypalPayement(int id) {
		PaypalPayment ppaymentIn = reposit.findById(id).orElse(null);
		if (ppaymentIn!= null) {
			reposit.delete(ppaymentIn);
		}
		
	}
}
