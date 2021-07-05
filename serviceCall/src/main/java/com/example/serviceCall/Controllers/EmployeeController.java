package com.example.serviceCall.Controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.serviceCall.Dto.BaseDto;
import com.example.serviceCall.Dto.EmployeeDto;
import com.example.serviceCall.Dto.EmployeePersonalDetailDto;
import com.example.serviceCall.Service.EmployeeService;

@RestController
public class EmployeeController {

	@Autowired
	private EmployeeService employeeService;

	@RequestMapping(value = "add/employee", method = RequestMethod.POST,produces=MediaType.APPLICATION_XML_VALUE)
	public EmployeeDto addEmployee (@RequestBody String dto) throws Exception {

		return employeeService.addEmployee(dto);
	}

	@RequestMapping(value = "get/employee", method = RequestMethod.GET)
	public EmployeeDto getEmployee(@RequestParam("empId") String empId) throws Exception {
		return employeeService.getEmployeeData(empId);

	}

	@RequestMapping(value = "update/employee", method = RequestMethod.PUT)
	public EmployeeDto updateEmployee(@RequestBody EmployeeDto dto) throws Exception {
		return employeeService.updateEmployeeDate(dto);
	}
	
	@RequestMapping(value = "create/employee", method = RequestMethod.POST,produces=MediaType.APPLICATION_XML_VALUE)
	public EmployeeDto createEmployee(@RequestBody EmployeeDto dto) throws Exception {

		return employeeService.createEmployee(dto);
	}

	@RequestMapping(value = "create2/employee", method = RequestMethod.POST,produces=MediaType.APPLICATION_XML_VALUE)
	public EmployeePersonalDetailDto createEmployee2(@RequestBody EmployeePersonalDetailDto dto) throws Exception {

		return employeeService.createEmployee(dto);
	}
}
