package com.imaginnovate.task.controller;

import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.BindingResult;
import org.springframework.validation.FieldError;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.imaginnovate.task.payload.EmployeeDto;
import com.imaginnovate.task.payload.EmployeeTaxDetails;
import com.imaginnovate.task.service.EmployeeService;

import jakarta.validation.Valid;

@RestController
@RequestMapping("/api/employee")
public class EmployeeController {
	
	
	@Autowired
	private EmployeeService employeeService;
	
	

	@PostMapping
	public ResponseEntity<?> addemploye(@Valid @RequestBody EmployeeDto employeedto, BindingResult bindingResult) {
		if (bindingResult.hasErrors()) {
			Map<String, String> validationsMap = new HashMap<String, String>();
			for (FieldError error : bindingResult.getFieldErrors()) {
				validationsMap.put(error.getField(), error.getDefaultMessage());
			}
			return new ResponseEntity<Map<String, String>>(validationsMap, HttpStatus.BAD_REQUEST);

		} else {

			EmployeeDto empFromDB = employeeService.createEmployee(employeedto);
			return new ResponseEntity<EmployeeDto>(empFromDB, HttpStatus.CREATED);
		}
	}
	
	@GetMapping("/{id}")
	public ResponseEntity<EmployeeTaxDetails> taxDeductionCurrentYear(@PathVariable("id")Long id){
		return new ResponseEntity<EmployeeTaxDetails>(employeeService.taxDetailsForPresentYear(id),HttpStatus.OK);
		
	}
	

}
