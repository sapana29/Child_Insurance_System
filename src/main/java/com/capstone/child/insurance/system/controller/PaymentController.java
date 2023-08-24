package com.capstone.child.insurance.system.controller;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.web.bind.annotation.RestController;

import com.capstone.child.insurance.system.dao.PaymentRepository;


@RestController
public class PaymentController {

	@Autowired
	PaymentRepository paymentRepo;

}
