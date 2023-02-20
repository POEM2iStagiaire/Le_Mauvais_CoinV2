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

import com.LeMauvaisCoin.com.LeMauvaisCoin.entity.PaypalPayment;
import com.LeMauvaisCoin.com.LeMauvaisCoin.service.PaypalPayementService;

@RestController
@RequestMapping("/ppayment")
public class PaypalPaymentController {

	@Autowired
	PaypalPayementService ppService;
	
	@GetMapping("/{id}")
	public PaypalPayment getById(@PathVariable("id") int id) {
		return ppService.getByIdPaypalPayement(id);
	}
	
	@GetMapping
	public List<PaypalPayment> getAll(){
		return ppService.getAllPaypalPayement();
	}
	
	@PostMapping
	public void postPaypalPayment(@RequestBody PaypalPayment pp) {
		ppService.createPaypalPayement(pp);
	}
	
	@PutMapping("/{id}")
	public void putPaypalPayment(@PathVariable("id") int id,@RequestBody PaypalPayment pp) {
		ppService.updateCreditPaypalPayement(id, pp);
	}
	
	@DeleteMapping("/{id}")
	public void deletePaypalPayment(@PathVariable("id") int id) {
		ppService.deleteCreditPaypalPayement(id);
	}
}
