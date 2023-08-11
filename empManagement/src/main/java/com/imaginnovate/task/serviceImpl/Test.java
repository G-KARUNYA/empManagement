package com.imaginnovate.task.serviceImpl;

import java.time.LocalDate;
import java.time.Period;

public class Test {

	
	public static void main(String[] args) {
		
		/*
        // Define the birthdates
        LocalDate birthdate1 = LocalDate.of(1990, 5, 15);
        LocalDate birthdate2 = LocalDate.of(1990, 5, 23);
        
        // Calculate the age difference
        Period ageDifference = Period.between(birthdate1, birthdate2);
        
        // Print the result
        System.out.println("Age difference: " + ageDifference.getYears() + " years, " +
                           ageDifference.getMonths() + " months, " +
                           ageDifference.getDays() + " days");}
	
	*/
		
		  LocalDate startDate = LocalDate.of(2023, 3, 15);
	        LocalDate endDate = LocalDate.of(2023, 4, 25);

	        Period period = Period.between(startDate, endDate);
	        int months =  period.getDays();

	        System.out.println("Difference in months: " + months);
	        
	}
		
}
