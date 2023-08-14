package com.example.CrudeRepoMethods.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="USER_DETAILS")
public class User {
	
	@Id
	@Column(name="User_id")
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int UserId;
	
	@Column(name="User_Name")
	private String UserName;
	
	@Column(name="User_Address")
	private String UserAddress;
	
	@Column(name="User_Age")
	private int UserAge;
	
	@Column(name="User_Email")
	private String UserEmail;
	
	@Column(name="User_Pass")
	private String UserPass;
	
	public int getUserId() {
		return UserId;
	}
	public void setUserId(int userId) {
		UserId = userId;
	}
	public String getUserName() {
		return UserName;
	}
	public void setUserName(String userName) {
		UserName = userName;
	}
	public String getUserAddress() {
		return UserAddress;
	}
	public void setUserAddress(String userAddress) {
		UserAddress = userAddress;
	}
	public int getUserAge() {
		return UserAge;
	}
	public void setUserAge(int userAge) {
		UserAge = userAge;
	}
	public String getUserEmail() {
		return UserEmail;
	}
	public void setUserEmail(String userEmail) {
		UserEmail = userEmail;
	}
	public String getUserPass() {
		return UserPass;
	}
	public void setUserPass(String userPass) {
		UserPass = userPass;
	}
	@Override
	public String toString() {
		return "User [UserId=" + UserId + ", UserName=" + UserName + ", UserAddress=" + UserAddress + ", UserAge="
				+ UserAge + ", UserEmail=" + UserEmail + ", UserPass=" + UserPass + "]";
	}
	
	

}
