package com.demo.emp.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

@Entity
@Table(name="contactus")
public class ContactUs {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	@NotNull(message = "Enter first Name")
	@Size(min = 2, message = "enter min 2 characters")
	private String firstName;
	@NotNull(message = "Enter Last Name")
	@Size(min = 2, message = "enter min 2 characters")
	private String lastName;
	@NotNull(message = "Enter Email id")
	@Size(min = 2, message = "enter min 2 characters")
	private String email;
	@NotNull(message = "Enter Subject")
	@Size(min = 2, message = "enter min 2 characters")
	private String subject;
	@NotNull(message = "Enter Message")
	@Size(min = 2, message = "enter min 2 characters")
	private String message;
	
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
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
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getSubject() {
		return subject;
	}
	public void setSubject(String subject) {
		this.subject = subject;
	}
	public String getMessage() {
		return message;
	}
	public void setMessage(String message) {
		this.message = message;
	}
	
	
	

}
