package com.capstone.child.insurance.system.service;

import java.util.Collection;

import com.capstone.child.insurance.system.entity.PremiumCalculation;

public interface PremiumCalculationService {
	

	PremiumCalculation addPremCalc(PremiumCalculation newPremCalc);
	PremiumCalculation getPremCalcById(Integer id);
	PremiumCalculation updatePremCalcById(PremiumCalculation newPremCalc);
	String deletePremCalcById(Integer id);
	
	Collection<PremiumCalculation> getAllPremCalc(Integer id);    //Only For registered
	Collection<PremiumCalculation> getAllPremCalcForAdmin();      //For Admin

}
