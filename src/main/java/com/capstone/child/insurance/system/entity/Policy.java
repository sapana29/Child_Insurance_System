package com.capstone.child.insurance.system.entity;

import java.util.ArrayList;

import java.util.List;

import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.OneToMany;

@Entity
public class Policy {
	
	public enum claimType {
		EducationClaim, HealthClaim, EndowmentClaim
	}
	
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer policyId;               //Policy Id
	private String policyName;              //Policy Name
	private Integer policyDuration;          //Policy Duration in years
	private Double policyPrice;             //Policy Price
	private Boolean multipleClaims;            //Can be claimed multiple times?
	@Enumerated(EnumType.STRING)
	private claimType claimType; 
	
	@OneToMany
	 private List<Payment> payments = new ArrayList<>();    
	 @ManyToMany
	private List<Child> children = new ArrayList<>();    
	 
	public Policy() {
		super();
	}


	public Policy(String policyName, Integer policyDuration, Double policyPrice, Boolean multipleClaims,
			com.capstone.child.insurance.system.entity.Policy.claimType claimType, List<Payment> payments,
			List<Child> children) {
		super();
		this.policyName = policyName;
		this.policyDuration = policyDuration;
		this.policyPrice = policyPrice;
		this.multipleClaims = multipleClaims;
		this.claimType = claimType;
		this.payments = payments;
		this.children = children;
	}

	public claimType getClaimType() {
		return claimType;
	}

	public void setClaimType(claimType claimType) {
		this.claimType = claimType;
	}

	public Integer getPolicyId() {
		return policyId;
	}

	public void setPolicyId(Integer policyId) {
		this.policyId = policyId;
	}

	public String getPolicyName() {
		return policyName;
	}

	public void setPolicyName(String policyName) {
		this.policyName = policyName;
	}

	public Integer getPolicyDuration() {
		return policyDuration;
	}

	public void setPolicyDuration(Integer policyDuration) {
		this.policyDuration = policyDuration;
	}

	public Double getPolicyPrice() {
		return policyPrice;
	}

	public void setPolicyPrice(Double policyPrice) {
		this.policyPrice = policyPrice;
	}

	public Boolean getMultipleClaims() {
		return multipleClaims;
	}

	public void setMultipleClaims(Boolean multipleClaims) {
		this.multipleClaims = multipleClaims;
	}

	public List<Payment> getPayments() {
		return payments;
	}

	public void setPayments(List<Payment> payments) {
		this.payments = payments;
	}

	public List<Child> getChildren() {
		return children;
	}

	public void setChildren(List<Child> children) {
		this.children = children;
	}
	
	
	



}
