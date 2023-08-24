package com.capstone.child.insurance.system.service;

import java.util.Collection;

import com.capstone.child.insurance.system.entity.Payment;

public interface PaymentService {
	
	
	Payment addPayment(Payment newPayment);
	Payment getPaymentById(Integer id);
	Payment updatePaymentById(Payment newPayment);
	String deletePaymentById(Integer id);
	
	Collection<Payment> getAllPayments(Integer Id);  //For User

}
