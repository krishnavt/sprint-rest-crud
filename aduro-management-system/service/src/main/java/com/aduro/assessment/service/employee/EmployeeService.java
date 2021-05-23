package com.aduro.assessment.service.employee;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import javax.annotation.PostConstruct;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.aduro.assessment.dao.employee.EmployeeRepository;
import com.aduro.assessment.employee.Employee;

/**
 * @author vamsithatikonda
 * 
 *         Service class responsible for business logic and data access
 *
 */
@Service
public class EmployeeService {

	/**
	 * repo object to access data
	 */
	@Autowired
	private EmployeeRepository repository;

	/**
	 * Sample constructor to initialize dummy data
	 */
	@PostConstruct
	public void initAduroManagemenstSystem() {

		repository.saveAll(Stream.of(
				new Employee(101l, "Vamsi", "123A", "thatikonda.vamsy@gmail.com", "123456789", "Principal Developer"))
				.collect(Collectors.toList()));
	}

	public List<Employee> getEmployees() {
		return repository.findAll();
	}
}
