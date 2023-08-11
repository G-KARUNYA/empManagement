package com.imaginnovate.task.service;

import com.imaginnovate.task.payload.EmployeeDto;
import com.imaginnovate.task.payload.EmployeeTaxDetails;

import jakarta.validation.Valid;

public interface EmployeeService {

	 EmployeeDto createEmployee(@Valid EmployeeDto employeedto);

	EmployeeTaxDetails taxDetailsForPresentYear(Long id);
		

}
