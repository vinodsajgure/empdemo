package com.demo.emp.dto;

import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;

import org.hibernate.validator.constraints.NotEmpty;

public class ContactFormDto {

	@NotEmpty(message = "Enter first Name")
	@Size(min = 2, message = "Enter min 2 characters")
	@Pattern(regexp = "^[a-zA-Z]+$", message = "Invalid input")
	private String firstName;
	@NotEmpty(message = "Enter Last Name")
	@Size(min = 2, message = "Enter min 2 characters")
	@Pattern(regexp = "^[a-zA-Z]+$", message = "Invalid input")
	private String lastName;
	@NotEmpty(message = "Enter email Name")
	@Size(min = 2, message = "Enter min 2 characters")
	@Pattern(regexp = "^[\\w-\\.]+@([\\w-]+\\.)+[\\w-]{2,4}$", message = "Invalid email address")
	private String email;
	@NotEmpty(message = "Enter subject Name")
	@Size(min = 2, message = "Enter min 2 characters")
	private String subject;
	@NotEmpty(message = "Enter message here")
	@Size(min = 2, message = "Enter min 2 characters")
	private String message;

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
