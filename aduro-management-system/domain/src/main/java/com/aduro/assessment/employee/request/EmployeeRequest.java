package com.aduro.assessment.employee.request;

import java.util.List;

import com.aduro.assessment.employee.Employee;

import lombok.Data;

/**
 * @author vamsithatikonda
 * 
 *         The schema for the employee object is as follows, assume all fields
 *         are required.
 *
 */
@Data
public class EmployeeRequest {

	private List<Employee> employees;

}
