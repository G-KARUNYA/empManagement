package com.imaginnovate.task.payload;

import java.time.LocalDate;
import java.util.Set;

import com.imaginnovate.task.model.PhoneNo;

import jakarta.validation.constraints.NotNull;

public class EmployeeDto {

	
	private Long employeeId;
	
	@NotNull(message = " required firstName ")
	private String firstName;
	
	@NotNull(message = " required lastName ")
	private String lastName;
	
	@NotNull(message = " required email ")
	private String email;
	
	@NotNull(message = " required doj ")
	private LocalDate doj;
	
	@NotNull(message = " required salary ")
	private Double salary;

	private Set<PhoneNo> phoneNumber;

	public EmployeeDto(Long employeeId, String firstName, String lastName, String email, LocalDate doj, Double salary,
			Set<PhoneNo> phoneNumber) {
		super();
		this.employeeId = employeeId;
		this.firstName = firstName;
		this.lastName = lastName;
		this.email = email;
		this.doj = doj;
		this.salary = salary;
		this.phoneNumber = phoneNumber;
	}

	public EmployeeDto() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Long getEmployeeId() {
		return employeeId;
	}

	public void setEmployeeId(Long employeeId) {
		this.employeeId = employeeId;
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

	public LocalDate getDoj() {
		return doj;
	}

	public void setDoj(LocalDate doj) {
		this.doj = doj;
	}

	public Double getSalary() {
		return salary;
	}

	public void setSalary(Double salary) {
		this.salary = salary;
	}

	public Set<PhoneNo> getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(Set<PhoneNo> phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	@Override
	public String toString() {
		return "EmplyeeDto [employeeId=" + employeeId + ", firstName=" + firstName + ", lastName=" + lastName
				+ ", email=" + email + ", doj=" + doj + ", salary=" + salary + ", phoneNumber=" + phoneNumber + "]";
	}

}
