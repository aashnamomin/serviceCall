package com.example.serviceCall.Dto;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name="EmployeeDto")
public class EmployeeDto implements BaseDto {
	private String name;

	private String email;

	private String employeeId;

	private String salary;
	
	
	
	private String idnumber;

	
	public String getName() {
		return name;
	}
	@XmlElement
	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}
	@XmlElement
	public void setEmail(String email) {
		this.email = email;
	}

	public String getEmployeeId() {
		return employeeId;
	}
	@XmlElement
	public void setEmployeeId(String employeeId) {
		this.employeeId = employeeId;
	}

	public String getSalary() {
		return salary;
	}
	@XmlElement
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

