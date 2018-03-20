package com.mobiclix.usermanagement.domain;

import java.util.Date;
import java.util.UUID;

public class User {
	private String id;
	private String firstName;
	private String middleName;
	private String lastName;
	private String fullName;
	private Date birthday;
	private String emailAddress;
	
	public User() {
		this.id = UUID.randomUUID().toString();
	}
	
	public User (String fistName, String middleName, String lastName, Date birthday, String emailAddress) {
		this.id = UUID.randomUUID().toString();
		this.firstName = fistName;
		this.middleName = middleName;
		this.lastName = lastName;
		this.fullName = this.getFullName();
		this.emailAddress = emailAddress;
		this.birthday = birthday;
	}
	
	public String getId() {
		return id;
	}
	
	public void setId(String id) {
		this.id = id;
	}
	
	public String getFirstName() {
		return firstName;
	}
	
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	
	public String getMiddleName() {
		return middleName;
	}
	
	public void setMiddleName(String middleName) {
		this.middleName = middleName;
	}
	
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	
	public String getFullName() {
		return String.format("%s %s %s", firstName, middleName, lastName);
	}
	public void setFullName(String fullName) {
		this.fullName = fullName;
	}
	
	public Date getBirthday() {
		return birthday;
	}
	
	public void setBirthday(Date date) {
		this.birthday = date;
	}
	
	public String getEmailAddress() {
		return emailAddress;
	}
	
	public void setEmailAddress(String emailAddress) {
		this.emailAddress = emailAddress;
	}
	
	public void setUser(User user) {
		this.setId(user.getId());
		this.setBirthday(user.getBirthday());
		this.setEmailAddress(user.getEmailAddress());
		this.setFirstName(user.getFirstName());
		this.setMiddleName(user.getMiddleName());
		this.setLastName(user.getLastName());
		this.setFullName(user.getFullName());
	}
}
