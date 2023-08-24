package com.capstone.child.insurance.system.service;

import java.util.Collection;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.capstone.child.insurance.system.dao.PaymentRepository;
import com.capstone.child.insurance.system.entity.Payment;



@Service
public class PaymentServiceImpl implements PaymentService{
	
	@Autowired
	PaymentRepository paymentRepository;

	@Override
	public Payment addPayment(Payment newPayment) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Payment getPaymentById(Integer id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Payment updatePaymentById(Payment newPayment) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String deletePaymentById(Integer id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Collection<Payment> getAllPayments(Integer Id) {
		// TODO Auto-generated method stub
		return null;
	}

}
