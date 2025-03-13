package com.bb.entity;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Positive;

@Entity
public class Admin {
	
	@Id
	@NotNull(message="Id is a required field")
	@Min(value=1, message="Id should be greater than 1")
	@Max(value=1000, message="Id should be less than 1000")
	@Positive(message="Id should not be in negative")
	private int adminId;
	
	@NotEmpty(message="First name is a required field")
	@Pattern(regexp = "^[A-Z][a-z]*$", message="First name starts with capital letter & contain one word")
	private String adminFirstName;
	
	@NotEmpty(message="Last name is a required field")
	@Pattern(regexp = "^[A-Z][a-z]*$", message="Last name starts with capital letter & contain one word")
	private String adminLastName;
	
	@NotNull(message="Age is a required field")
	@Min(value = 1, message="age should be greater than 1")
	@Max(value=150, message = "age should be less than 150")
	@Positive(message="Age should be in postive integers")
	private int adminAge;
	
	@NotEmpty(message="Gender is a required field")
	@Pattern(regexp = "^(?:m|M|male|Male|f|F|female|Female)$", message = "Gender format should be in (M|m|Male|male|F|f|Female|female)")
	private String adminGender;
	
	@NotEmpty(message="Contact is a required field")
    @Pattern(regexp = "^[6-9]{1}[0-9]{9}$", message = "phone number starts with 6 to 9 and contain 10 digits")
	private String adminContact;
	
	@NotEmpty(message="Email is a required field")
	@Pattern(regexp = "^[a-zA-Z0-9+_.-]+@[a-zA-Z0-9.-]+$", message = "Email format:abc@example.com")
	private String adminEmail;
	
	@NotEmpty(message="Password is a required field")
	@Pattern(regexp ="^[\\w+\s+0-9]{8,}$",message="Password contain minimum 8 characters")
	private String adminPassword;
	
	@NotNull(message="Weight is a required field")
	private int adminWeight;
	
	@NotEmpty(message="State is a required field")
	@Pattern(regexp = "^[A-Z][a-z]*$", message="State starts with capital letter & contain one word")
	private String adminState;
	
	@NotEmpty(message="Area is a required field")
	@Pattern(regexp = "^[A-Z][a-z]*$", message="Area starts with capital letter & contain one word")
	private String adminArea;
	
	@NotNull(message="Pincode is a required field")
	@Min(value=100000,message = "Pincode contains 6 digits")
	@Max(value=999999,message = "Pincode contains 6 digits")
	private int adminPincode;
	
	@NotEmpty(message="Blood group cannot be null")
	@Pattern(regexp = "^(A|B|AB|O)[-+]$", message = "Valid blood groups are O,A,B,AB and append + or -")
	private String adminBloodGroup;

	public Admin() {

	}

	public Admin(int adminId, String adminFirstName, String adminLastName, int adminAge, String adminGender,
			String adminContact, String adminEmail, String adminPassword, int adminWeight, String adminState,
			String adminArea, int adminPincode, String adminBloodGroup) {
		super();
		this.adminId = adminId;
		this.adminFirstName = adminFirstName;
		this.adminLastName = adminLastName;
		this.adminAge = adminAge;
		this.adminGender = adminGender;
		this.adminContact = adminContact;
		this.adminEmail = adminEmail;
		this.adminPassword = adminPassword;
		this.adminWeight = adminWeight;
		this.adminState = adminState;
		this.adminArea = adminArea;
		this.adminPincode = adminPincode;
		this.adminBloodGroup = adminBloodGroup;
	}

	public int getAdminId() {
		return adminId;
	}

	public void setAdminId(int adminId) {
		this.adminId = adminId;
	}

	public String getAdminFirstName() {
		return adminFirstName;
	}

	public void setAdminFirstName(String adminFirstName) {
		this.adminFirstName = adminFirstName;
	}

	public String getAdminLastName() {
		return adminLastName;
	}

	public void setAdminLastName(String adminLastName) {
		this.adminLastName = adminLastName;
	}

	public int getAdminAge() {
		return adminAge;
	}

	public void setAdminAge(int adminAge) {
		this.adminAge = adminAge;
	}

	public String getAdminGender() {
		return adminGender;
	}

	public void setAdminGender(String adminGender) {
		this.adminGender = adminGender;
	}

	public String getAdminContact() {
		return adminContact;
	}

	public void setAdminContact(String adminContact) {
		this.adminContact = adminContact;
	}

	public String getAdminEmail() {
		return adminEmail;
	}

	public void setAdminEmail(String adminEmail) {
		this.adminEmail = adminEmail;
	}

	public String getAdminPassword() {
		return adminPassword;
	}

	public void setAdminPassword(String adminPassword) {
		this.adminPassword = adminPassword;
	}

	public int getAdminWeight() {
		return adminWeight;
	}

	public void setAdminWeight(int adminWeight) {
		this.adminWeight = adminWeight;
	}

	public String getAdminState() {
		return adminState;
	}

	public void setAdminState(String adminState) {
		this.adminState = adminState;
	}

	public String getAdminArea() {
		return adminArea;
	}

	public void setAdminArea(String adminArea) {
		this.adminArea = adminArea;
	}

	public int getAdminPincode() {
		return adminPincode;
	}

	public void setAdminPincode(int adminPincode) {
		this.adminPincode = adminPincode;
	}

	public String getAdminBloodGroup() {
		return adminBloodGroup;
	}

	public void setAdminBloodGroup(String adminBloodGroup) {
		this.adminBloodGroup = adminBloodGroup;
	}

	@Override
	public String toString() {
		return "Admin [adminId=" + adminId + ", adminFirstName=" + adminFirstName + ", adminLastName=" + adminLastName
				+ ", adminAge=" + adminAge + ", adminGender=" + adminGender + ", adminContact=" + adminContact
				+ ", adminEmail=" + adminEmail + ", adminPassword=" + adminPassword + ", adminWeight=" + adminWeight
				+ ", adminState=" + adminState + ", adminArea=" + adminArea + ", adminPincode=" + adminPincode
				+ ", adminBloodGroup=" + adminBloodGroup + "]";
	}

}
