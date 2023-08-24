package com.capstone.child.insurance.system.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class PremiumCalculation {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer premiumCalculationId;               //premium calculation id
	private Integer parentAge;              //parent age
	private Integer childAge;           //child age
	private Double cover;             //Cover Amount
	private Integer duration;          //Duration in years
	private Double premium;           //Monthly amount to be paid
	
	
	public PremiumCalculation() {
		super();
	}


	public PremiumCalculation(Integer parentAge, Integer childAge, Double cover, Integer duration,
			Double premium) {
		super();
		this.parentAge = parentAge;
		this.childAge = childAge;
		this.cover = cover;
		this.duration = duration;
		this.premium = premium;
	}


	public Integer getPremiumCalculationId() {
		return premiumCalculationId;
	}


	public void setPremiumCalculationId(Integer premiumCalculationId) {
		this.premiumCalculationId = premiumCalculationId;
	}


	public Integer getParentAge() {
		return parentAge;
	}


	public void setParentAge(Integer parentAge) {
		this.parentAge = parentAge;
	}


	public Integer getChildAge() {
		return childAge;
	}


	public void setChildAge(Integer childAge) {
		this.childAge = childAge;
	}


	public Double getCover() {
		return cover;
	}


	public void setCover(Double cover) {
		this.cover = cover;
	}


	public Integer getDuration() {
		return duration;
	}


	public void setDuration(Integer duration) {
		this.duration = duration;
	}


	public Double getPremium() {
		return premium;
	}


	public void setPremium(Double premium) {
		this.premium = premium;
	}
	
	




}
