package com.LeMauvaisCoin.com.LeMauvaisCoin.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.LeMauvaisCoin.com.LeMauvaisCoin.entity.CreditCardPayment;
import com.LeMauvaisCoin.com.LeMauvaisCoin.service.CreditCardPaymentService;

@RestController
@RequestMapping("/ccpayment")
public class CreditCardPaymentController {

	@Autowired
	CreditCardPaymentService ccpService;
	
	@GetMapping("/{id}")
	public CreditCardPayment getById(@PathVariable("id") int id) {
		return ccpService.getByIdCreditCardPayment(id);
	}
	
	@GetMapping
	public List<CreditCardPayment> getAll(){
		return ccpService.getAllCreditCardPayment();
	}
	
	@PostMapping
	public void postCreditCardPayment(@RequestBody CreditCardPayment ccp) {
		ccpService.createCreditCardPayment(ccp);
	}
	
	@PutMapping("/{id}")
	public void putCreditCardPayment(@PathVariable("id") int id,@RequestBody CreditCardPayment ccp) {
		ccpService.updateCreditCardPayment(id, ccp);
	}
	
	@DeleteMapping("/{id}")
	public void deleteCreditCardPayment(@PathVariable("id") int id) {
		ccpService.deleteCreditCardPayment(id);
	}
}
