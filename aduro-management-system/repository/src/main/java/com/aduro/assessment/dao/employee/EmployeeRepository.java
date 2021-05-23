package com.aduro.assessment.dao.employee;

import org.springframework.data.jpa.repository.JpaRepository;

import com.aduro.assessment.employee.Employee;

/**
 * @author vamsithatikonda
 * 
 *         Repository class to make data access from Database
 *
 */
public interface EmployeeRepository extends JpaRepository<Employee, Long> {
}
