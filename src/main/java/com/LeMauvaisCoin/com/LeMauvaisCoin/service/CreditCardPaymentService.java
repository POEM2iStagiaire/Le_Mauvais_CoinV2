package com.LeMauvaisCoin.com.LeMauvaisCoin.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.LeMauvaisCoin.com.LeMauvaisCoin.entity.CreditCardPayment;
import com.LeMauvaisCoin.com.LeMauvaisCoin.repository.CreditCardPaymentRepository;
import com.LeMauvaisCoin.com.LeMauvaisCoin.repository.PaymentRepository;

@Service
public class CreditCardPaymentService {

	@Autowired
	CreditCardPaymentRepository reposit;
	
	public void createCreditCardPayment(CreditCardPayment ccp) {   // ccp = CreditCardPayment
		reposit.save(ccp);
	}
	

	public CreditCardPayment getByIdCreditCardPayment(int id) {
		return reposit.findById(id).orElse(null);
	}

	
	public List<CreditCardPayment> getAllCreditCardPayment() {
		return reposit.findAll();
	}

	
	public void updateCreditCardPayment(int id, CreditCardPayment ccp) {
		CreditCardPayment ccpaymentIn = reposit.findById(id).orElse(null);
		if (ccp!= null) {
			ccpaymentIn.setCardNumber( ccp.getCardNumber() );
			ccpaymentIn.setExpirationDate( ccp.getExpirationDate());
			reposit.save(ccpaymentIn);
		}
	}
	

	public void deleteCreditCardPayment(int id) {
		CreditCardPayment ccpaymentIn = reposit.findById(id).orElse(null);
		if (ccpaymentIn!= null) {
			reposit.delete(ccpaymentIn);
		}
		
	}
}
