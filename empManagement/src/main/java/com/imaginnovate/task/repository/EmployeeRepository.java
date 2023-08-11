package com.imaginnovate.task.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.imaginnovate.task.model.Employee;

public interface EmployeeRepository extends JpaRepository<Employee, Long> {

}
