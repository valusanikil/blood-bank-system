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
public class User {

	@Id
	@NotNull(message="Id is a required field")
	@Min(value=1, message="Id should be greater than 1")
	@Max(value=1000, message="Id should be less than 1000")
	@Positive(message="Id should not be in negative")
    private int userId;
	
	@NotEmpty(message="First name is a required field")
	@Pattern(regexp = "^[A-Z][a-z]*$", message="First name starts with capital letter & contain one word")
    private String userFirstName;
	
	@NotEmpty(message="Last name is a required field")
	@Pattern(regexp = "^[A-Z][a-z]*$", message="Last name starts with capital letter & contain one word")
    private String userLastName;
	
	@NotNull(message="Age is a required field")
	@Min(value = 1, message="age should be greater than 1")
	@Max(value=150, message = "age should be less than 150")
	@Positive(message="Age should be in postive integers")
    private int userAge;
	
	@NotEmpty(message="Gender is a required field")
	@Pattern(regexp = "^(?:m|M|male|Male|f|F|female|Female)$", message = "Gender format should be in (M|m|Male|male|F|f|Female|female)")
    private String userGender;
	
	@NotEmpty(message="Contact is a required field")
    @Pattern(regexp = "^[6-9]{1}[0-9]{9}$", message = "phone number starts with 6 to 9 and contain 10 digits")
    private String userContact;
	
	@NotEmpty(message="Email is a required field")
	@Pattern(regexp = "^[a-zA-Z0-9+_.-]+@[a-zA-Z0-9.-]+$", message = "Email format:abc@example.com")
    private String userEmail;
	
	@NotEmpty(message="Password is a required field")
	@Pattern(regexp ="^[\\w+\s+0-9]{8,}$",message="Password contain minimum 8 characters")
    private String userPassword;
	
	@NotNull(message="Weight is a required field")
    private int userWeight;
	
	@NotEmpty(message="State is a required field")
	@Pattern(regexp = "^[A-Z][a-z]*$", message="State starts with capital letter & contain one word")
    private String userState;
	
	@NotEmpty(message="Area is a required field")
	@Pattern(regexp = "^[A-Z][a-z]*$", message="Area starts with capital letter & contain one word")
    private String userArea;
	
	@NotNull(message="Pincode is a required field")
	@Min(value=100000,message = "Pincode contains 6 digits")
	@Max(value=999999,message = "Pincode contains 6 digits")
    private int userPincode;
	
	@NotEmpty(message="Blood group cannot be null")
	@Pattern(regexp = "^(A|B|AB|O)[-+]$", message = "Valid blood groups are O,A,B,AB and append + or -")
    private String userBloodGroup;
    
    public User() {
    	
    }

	public User(int userId, String userFirstName, String userLastName, int userAge, String userGender,
			String userContact, String userEmail, String userPassword, int userWeight, String userState,
			String userArea, int userPincode, String userBloodGroup) {
		super();
		this.userId = userId;
		this.userFirstName = userFirstName;
		this.userLastName = userLastName;
		this.userAge = userAge;
		this.userGender = userGender;
		this.userContact = userContact;
		this.userEmail = userEmail;
		this.userPassword = userPassword;
		this.userWeight = userWeight;
		this.userState = userState;
		this.userArea = userArea;
		this.userPincode = userPincode;
		this.userBloodGroup = userBloodGroup;
	}

	public int getUserId() {
		return userId;
	}

	public void setUserId(int userId) {
		this.userId = userId;
	}

	public String getUserFirstName() {
		return userFirstName;
	}

	public void setUserFirstName(String userFirstName) {
		this.userFirstName = userFirstName;
	}

	public String getUserLastName() {
		return userLastName;
	}

	public void setUserLastName(String userLastName) {
		this.userLastName = userLastName;
	}

	public int getUserAge() {
		return userAge;
	}

	public void setUserAge(int userAge) {
		this.userAge = userAge;
	}

	public String getUserGender() {
		return userGender;
	}

	public void setUserGender(String userGender) {
		this.userGender = userGender;
	}

	public String getUserContact() {
		return userContact;
	}

	public void setUserContact(String userContact) {
		this.userContact = userContact;
	}

	public String getUserEmail() {
		return userEmail;
	}

	public void setUserEmail(String userEmail) {
		this.userEmail = userEmail;
	}

	public String getUserPassword() {
		return userPassword;
	}

	public void setUserPassword(String userPassword) {
		this.userPassword = userPassword;
	}

	public int getUserWeight() {
		return userWeight;
	}

	public void setUserWeight(int userWeight) {
		this.userWeight = userWeight;
	}

	public String getUserState() {
		return userState;
	}

	public void setUserState(String userState) {
		this.userState = userState;
	}

	public String getUserArea() {
		return userArea;
	}

	public void setUserArea(String userArea) {
		this.userArea = userArea;
	}

	public int getUserPincode() {
		return userPincode;
	}

	public void setUserPincode(int userPincode) {
		this.userPincode = userPincode;
	}

	public String getUserBloodGroup() {
		return userBloodGroup;
	}

	public void setUserBloodGroup(String userBloodGroup) {
		this.userBloodGroup = userBloodGroup;
	}

	@Override
	public String toString() {
		return "User [userId=" + userId + ", userFirstName=" + userFirstName + ", userLastName=" + userLastName
				+ ", userAge=" + userAge + ", userGender=" + userGender + ", userContact=" + userContact
				+ ", userEmail=" + userEmail + ", userPassword=" + userPassword + ", userWeight=" + userWeight
				+ ", userState=" + userState + ", userArea=" + userArea + ", userPincode=" + userPincode
				+ ", userBloodGroup=" + userBloodGroup + "]";
	}  
	
}
