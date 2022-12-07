package com.gl.entities;

public class Employee {
	private String firstName;
	private String lastName;
	private String Email;
	private String password;
	public Employee(String firstName, String lastName) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
	} 
	@Override
	public String toString() {
		return "Employee details [\n firstName=" + firstName + ",\n lastName=" + lastName + ",\n Email=" + Email + ",\n password="
				+ password + "]";
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
	public String getEmail() {
		return Email;
	}
	public void setEmail(String email) {
		Email = email;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	
	
	
}
