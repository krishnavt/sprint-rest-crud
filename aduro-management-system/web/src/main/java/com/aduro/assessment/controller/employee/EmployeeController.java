package com.aduro.assessment.controller.employee;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.aduro.assessment.dao.employee.EmployeeRepository;
import com.aduro.assessment.employee.Employee;
import com.aduro.assessment.employee.request.EmployeeRequest;
import com.aduro.assessment.service.employee.exceptions.ResourceNotFoundException;

/**
 * @author vamsithatikonda
 * 
 * @implSpec Rest controller API responsible for CRUD functionality
 *
 */
@RestController
@RequestMapping("/api")
public class EmployeeController {

	/**
	 * Repo object for Employee database
	 */
	@Autowired
	EmployeeRepository EmployeeRepository;

	/**
	 * 
	 * @implNote CREATE
	 * 
	 * @implSpec Service API to create new employees in to management system
	 * 
	 * @param employees
	 * @return
	 */
	@PostMapping("/create-employees")
	public ResponseEntity<?> createEmployee(@Valid @RequestBody EmployeeRequest employees) {

		for (Employee employee : employees.getEmployees()) {
			EmployeeRepository.save(employee);
		}
		return ResponseEntity.ok().build();
	}

	/**
	 * 
	 * @implNote READ
	 * 
	 * @implSpec Service API to retrieve all employee
	 * 
	 * @return
	 */
	@GetMapping("/list-employees")
	public List<Employee> getAllEmployees() {
		return EmployeeRepository.findAll();
	}

	/**
	 * 
	 * @implNote READ
	 * 
	 * @implSpec Service API to read Single API
	 * 
	 * @param EmployeeId
	 * @return
	 */
	@GetMapping("/get-employee/{id}")
	public Employee getEmployeeById(@PathVariable(value = "id") Long EmployeeId) {
		return EmployeeRepository.findById(EmployeeId)
				.orElseThrow(() -> new ResourceNotFoundException("Employee", "id", EmployeeId));
	}

	/**
	 * 
	 * @implNote UPDATE
	 * 
	 * @implSpec Service API to update employee details
	 * 
	 * @param EmployeeId
	 * @param EmployeeDetails
	 * @return
	 */
	@PutMapping("/update-employee/{id}")
	public Employee updateEmployee(@PathVariable(value = "id") Long EmployeeId,
			@Valid @RequestBody Employee EmployeeDetails) {

		Employee Employee = EmployeeRepository.findById(EmployeeId)
				.orElseThrow(() -> new ResourceNotFoundException("Employee", "id", EmployeeId));

		Employee.setRole(EmployeeDetails.getRole());
		Employee.setEmail(EmployeeDetails.getEmail());
		Employee.setName(EmployeeDetails.getName());
		Employee.setOffice(EmployeeDetails.getOffice());
		Employee.setPhone(EmployeeDetails.getPhone());
		Employee.setRole(EmployeeDetails.getRole());

		Employee updatedEmployee = EmployeeRepository.save(Employee);
		return updatedEmployee;
	}

	/**
	 * 
	 * @implNote DELETE
	 * 
	 * @implSpec Service API to delete employee from Management System
	 * 
	 * 
	 * @param EmployeeId
	 * @return
	 */
	@DeleteMapping("/delete-employee/{id}")
	public ResponseEntity<?> deleteEmployee(@PathVariable(value = "id") Long EmployeeId) {
		Employee Employee = EmployeeRepository.findById(EmployeeId)
				.orElseThrow(() -> new ResourceNotFoundException("Employee", "id", EmployeeId));

		EmployeeRepository.delete(Employee);

		return ResponseEntity.ok().build();
	}
}
