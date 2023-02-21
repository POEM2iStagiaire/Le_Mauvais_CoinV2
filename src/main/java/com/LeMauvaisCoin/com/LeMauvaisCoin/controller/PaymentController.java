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

import com.LeMauvaisCoin.com.LeMauvaisCoin.entity.Payment;
import com.LeMauvaisCoin.com.LeMauvaisCoin.service.PaymentService;

@RestController
@RequestMapping("/payment")
public class PaymentController {

	@Autowired
	PaymentService pService;
	

		
	@GetMapping("/{id}")
	public Payment getById(@PathVariable("id") int id) {
		return pService.getByIdPayement(id);
	}
	
	@GetMapping
	public List<Payment> getAll(){
		return pService.getAllPayement();
	}
	
	@PostMapping
	public void postPayment(@RequestBody Payment p) {
		pService.createPayement(p);
	}
	
	@PutMapping("/{id}")
	public void putPayment(@PathVariable("id") int id,@RequestBody Payment p) {
		pService.updatePayement(id, p);
	}
	
	@DeleteMapping("/{id}")
	public void deletePayment(@PathVariable("id") int id) {
		pService.deletePayement(id);
	}
	
}
