package com.luv2code.springdemo.mvc;

import javax.validation.constraints.NotNull;

public class Student {
	
	private String firstName;
	
	@NotNull(message="is required")
	private String lastName;
	
	private String country;
	
	private String favouriteLang;
	
	private String[] operatingSystems;
	
	public Student() {
		
	}
	
	
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public String getCountry() {
		return country;
	}
	public void setCountry(String country) {
		this.country = country;
	}


	public String[] getOperatingSystems() {
		return operatingSystems;
	}


	public void setOperatingSystems(String[] operatingSystems) {
		this.operatingSystems = operatingSystems;
	}


	public String getFavouriteLang() {
		return favouriteLang;
	}


	public void setFavouriteLang(String favouriteLang) {
		this.favouriteLang = favouriteLang;
	}
	
	

}
