package com.capstone.child.insurance.system.service;

import java.util.Collection;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.capstone.child.insurance.system.dao.PremiumCalculationRepository;
import com.capstone.child.insurance.system.entity.PremiumCalculation;

@Service
public class PremiumCalculationServiceImpl implements PremiumCalculationService{
	@Autowired
	PremiumCalculationRepository premCalcRepository;

	@Override
	public PremiumCalculation addPremCalc(PremiumCalculation newPremCalc) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public PremiumCalculation getPremCalcById(Integer id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public PremiumCalculation updatePremCalcById(PremiumCalculation newPremCalc) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String deletePremCalcById(Integer id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Collection<PremiumCalculation> getAllPremCalc(Integer id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Collection<PremiumCalculation> getAllPremCalcForAdmin() {
		// TODO Auto-generated method stub
		return null;
	}

}
