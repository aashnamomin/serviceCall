package com.example.serviceCall.Dto;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name="EmployeeDto")
public class EmployeePersonalDetailDto implements BaseDto {

	private String name;

	private String email;

	private String employeeId;
	
	private String idnumber;

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

	public String getIdnumber() {
		return idnumber;
	}

	public void setIdnumber(String idnumber) {
		this.idnumber = idnumber;
	}

	
	
	

}
