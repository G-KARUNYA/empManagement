package com.imaginnovate.task.payload;

public class EmployeeTaxDetails {

	private Long employeeID;
	private String firstName;
	private String lastName;
	private Double yearlysal;
	private Double totalTexAmount;
	private Double totalCessAmount;

	public EmployeeTaxDetails(Long employeeID, String firstName, String lastName, Double yearlysal,
			Double totalTexAmount, Double totalCessAmount) {
		super();
		this.employeeID = employeeID;
		this.firstName = firstName;
		this.lastName = lastName;
		this.yearlysal = yearlysal;
		this.totalTexAmount = totalTexAmount;
		this.totalCessAmount = totalCessAmount;
	}

	public EmployeeTaxDetails() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Long getEmployeeID() {
		return employeeID;
	}

	public void setEmployeeID(Long employeeID) {
		this.employeeID = employeeID;
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

	public Double getYearlysal() {
		return yearlysal;
	}

	public void setYearlysal(Double yearlysal) {
		this.yearlysal = yearlysal;
	}

	public Double getTotalTexAmount() {
		return totalTexAmount;
	}

	public void setTotalTexAmount(Double totalTexAmount) {
		this.totalTexAmount = totalTexAmount;
	}

	public Double getTotalCessAmount() {
		return totalCessAmount;
	}

	public void setTotalCessAmount(Double totalCessAmount) {
		this.totalCessAmount = totalCessAmount;
	}

	@Override
	public String toString() {
		return "EmployeeTaxDetails [employeeID=" + employeeID + ", firstName=" + firstName + ", lastName=" + lastName
				+ ", yearlysal=" + yearlysal + ", totalTexAmount=" + totalTexAmount + ", totalCessAmount="
				+ totalCessAmount + "]";
	}

}
