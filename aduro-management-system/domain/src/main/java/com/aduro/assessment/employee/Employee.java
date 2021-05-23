package com.aduro.assessment.employee;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

/**
 * @author vamsithatikonda
 *
 *         Employee Entity object to hold employee data
 *
 */
@Data
@AllArgsConstructor
@NoArgsConstructor

@ToString
@Entity
public class Employee {

	@Id
	private Long id;

	// Name: String 100 Characters
	@Column(name = "employee_name", length = 100)
	public String name;

	// Office: String 4 Characters
	@Column(name = "employee_office", length = 4)
	public String office;

	// Email: String 150 Characters
	@Column(name = "employee_email", length = 150)
	public String email;

	// Phone: String 12 Characters
	@Column(name = "employee_phone", length = 12)
	public String phone;

	// Role: String 150 Characters&gt;
	@Column(name = "employee_role", length = 150)
	public String role;

}
