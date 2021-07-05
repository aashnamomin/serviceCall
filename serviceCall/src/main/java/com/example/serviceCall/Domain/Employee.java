package com.example.serviceCall.Domain;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table(name = "EMPLOYEE")

public class Employee {

	@Id
	private String employeeId;
	
	private String name;

	private String email;

	private String salary;
	
	private String idnumber;

	public Employee() {
	}

	
	public Employee(String employeeId, String name, String email, String salary, String idnumber) {
		super();
		this.employeeId = employeeId;
		this.name = name;
		this.email = email;
		this.salary = salary;
		this.idnumber = idnumber;
	}


	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getEmployeeId() {
		return employeeId;
	}

	public void setEmployeeId(String employeeId) {
		this.employeeId = employeeId;
	}

	public String getSalary() {
		return salary;
	}

	public void setSalary(String salary) {
		this.salary = salary;
	}

	public String getIdnumber() {
		return idnumber;
	}

	public void setIdnumber(String idnumber) {
		this.idnumber = idnumber;
	}
	
	
}