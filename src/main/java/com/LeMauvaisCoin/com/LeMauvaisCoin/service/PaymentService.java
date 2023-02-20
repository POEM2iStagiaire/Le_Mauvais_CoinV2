package com.LeMauvaisCoin.com.LeMauvaisCoin.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.LeMauvaisCoin.com.LeMauvaisCoin.entity.Payment;
import com.LeMauvaisCoin.com.LeMauvaisCoin.repository.PaymentRepository;

@Service
public class PaymentService {
	@Autowired
	PaymentRepository reposit;
	
	
	public void createPayement(Payment p) {
		reposit.save(p);
	}

	public Payment getByIdPayement(int id) {
		return reposit.findById(id).orElse(null);
	}

	public List<Payment> getAllPayement() {
		return reposit.findAll();
	}

	public void updatePayement(int id, Payment p) {
		Payment paymentIn = reposit.findById(id).orElse(null);
		if (p!= null) {
			paymentIn.setAmount( p.getAmount() );
			paymentIn.setPaymentDate( p.getPaymentDate());
			reposit.save(paymentIn);
		}
	}
	

	public void deletePayement(int id) {
		Payment payement = reposit.findById(id).orElse(null);
		if (payement!= null) {
			reposit.delete(payement);
		}
		
	}
	
	
	
	
}
