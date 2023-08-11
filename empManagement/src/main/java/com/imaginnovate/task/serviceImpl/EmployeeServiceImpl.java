package com.imaginnovate.task.serviceImpl;

import java.time.LocalDate;
import java.time.Period;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.imaginnovate.task.exception.ResourceNotFoundExceptiont;
import com.imaginnovate.task.model.Employee;
import com.imaginnovate.task.payload.EmployeeDto;
import com.imaginnovate.task.payload.EmployeeTaxDetails;
import com.imaginnovate.task.repository.EmployeeRepository;
import com.imaginnovate.task.service.EmployeeService;

import jakarta.validation.Valid;

@Service
public class EmployeeServiceImpl implements EmployeeService{
	
	
	
	@Autowired
	private ModelMapper modelMapper;

	@Autowired
	private EmployeeRepository employeeRepository;

	@Override
	public EmployeeDto createEmployee(@Valid EmployeeDto employeedto) {
		
		Employee employee = modelMapper.map(employeedto, Employee.class);
		EmployeeDto empDto = null;
		Employee emp = null;
		try {
			emp = employeeRepository.save(employee);

		} catch (Exception e) {
			
			throw new ResourceNotFoundExceptiont("employee allready existed");
		}
		empDto = modelMapper.map(emp, EmployeeDto.class);
		return empDto;

	}

	@Override
	public EmployeeTaxDetails taxDetailsForPresentYear(Long id) {

		Double tax = 0.0;
		Double cess = 0.0;
		
	
		Employee employeebyid = employeeRepository.findById(id)
				.orElseThrow(() -> new ResourceNotFoundExceptiont("EmployeeNotFoundException"));

		EmployeeDto employeeDto = modelMapper.map(employeebyid, EmployeeDto.class);
		LocalDate employeestartingdate = employeeDto.getDoj();
		
		System.out.println(employeestartingdate);
		LocalDate employeeendingdate = LocalDate.now();
		System.out.println(employeeendingdate);
		
		int joiningMonth = employeestartingdate.getMonthValue();
		
		int joiningYear = employeestartingdate.getYear();
		
		
	Double empSal	= employeeDto.getSalary();
	
	Double totalsalaryofemployee = 0.0;
		
		if(joiningMonth <= 3) {
			
			  
		        LocalDate endDate = LocalDate.of(joiningYear, 3, 31);

		        Period period = Period.between(employeestartingdate, endDate);
				
			totalsalaryofemployee = period.getMonths() * empSal + (period.getDays()/30)* empSal;
	
			}else {
			
			  
		        LocalDate endDate = LocalDate.of(joiningYear+1, 3, 31);

		        Period period = Period.between(employeestartingdate, endDate);
				
			 totalsalaryofemployee = period.getMonths() * empSal + (period.getDays()/30)* empSal;
	
			}
			
		

		if (totalsalaryofemployee > 250000 && totalsalaryofemployee <= 500000) {

			tax = (totalsalaryofemployee - 250000) * 0.05;

		} else if (totalsalaryofemployee > 500000 && totalsalaryofemployee <= 1000000) {
			tax = 12500 + (totalsalaryofemployee - 500000) * 0.1;
		} else if (totalsalaryofemployee > 1000000) {

			tax = 112500 + (totalsalaryofemployee - 1000000) * 0.2;
		}

		if (totalsalaryofemployee > 2500000) {
			cess = (totalsalaryofemployee - 2500000) * 0.02;
		}
		double employeetotaltax = tax + cess;
		
		EmployeeTaxDetails employeetaxInfo = new EmployeeTaxDetails();
		employeetaxInfo.setEmployeeID(employeeDto.getEmployeeId());
		employeetaxInfo.setFirstName(employeeDto.getFirstName());
		employeetaxInfo.setLastName(employeeDto.getLastName());
		
		employeetaxInfo.setYearlysal(employeeDto.getSalary()*12);
		employeetaxInfo.setTotalTexAmount(tax);
		employeetaxInfo.setTotalCessAmount(cess);

		return employeetaxInfo;
	}
	
	
	

}
