package com.bloodbank.entity;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Positive;

@Entity
public class BloodRequirement {
	
	@Id
	@NotNull(message="Id is a required field")
	@Min(value=1, message="Id should be greater than 1")
	@Max(value=1000, message="Id should be less than 1000")
	@Positive(message="Id should not be in negative")
	private int brId;
	
	@NotEmpty(message="State is a required field")
	@Pattern(regexp = "^[A-Z][a-z]*$", message="State starts with capital letter & contain one word")
	private String brState;
	
	@NotEmpty(message="Area is a required field")
	@Pattern(regexp = "^[A-Z][a-z]*$", message="Area starts with capital letter & contain one word")
	private String brArea;
	
	@NotNull(message="Pincode is a required field")
	@Min(value=100000,message = "Pincode contains 6 digits")
	@Max(value=999999,message = "Pincode contains 6 digits")
	private int brPincode;
	
	@NotEmpty(message="Blood group cannot be null")
	@Pattern(regexp = "^(A|B|AB|O)[-+]$", message = "Valid blood groups are O,A,B,AB and append + or -")
	private String brBloodGroup;
	
	public BloodRequirement() {
		
	}

	public BloodRequirement(int brId, String brState, String brArea, int brPincode, String brBloodGroup) {
		super();
		this.brId = brId;
		this.brState = brState;
		this.brArea = brArea;
		this.brPincode = brPincode;
		this.brBloodGroup = brBloodGroup;
	}

	public int getBrId() {
		return brId;
	}

	public void setBrId(int brId) {
		this.brId = brId;
	}

	public String getBrState() {
		return brState;
	}

	public void setBrState(String brState) {
		this.brState = brState;
	}

	public String getBrArea() {
		return brArea;
	}

	public void setBrArea(String brArea) {
		this.brArea = brArea;
	}

	public int getBrPincode() {
		return brPincode;
	}

	public void setBrPincode(int brPincode) {
		this.brPincode = brPincode;
	}

	public String getBrBloodGroup() {
		return brBloodGroup;
	}

	public void setBrBloodGroup(String brBloodGroup) {
		this.brBloodGroup = brBloodGroup;
	}

	@Override
	public String toString() {
		return "BloodRequirement [brId=" + brId + ", brState=" + brState + ", brArea=" + brArea + ", brPincode="
				+ brPincode + ", brBloodGroup=" + brBloodGroup + "]";
	}
	
}
