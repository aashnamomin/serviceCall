package com.example.serviceCall.Service;

import java.io.StringReader;
import java.util.Optional;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.Unmarshaller;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.example.serviceCall.Domain.Employee;
import com.example.serviceCall.Dto.EmployeeDto;
import com.example.serviceCall.Dto.EmployeePersonalDetailDto;
import com.example.serviceCall.Repository.EmployeeRepository;
import com.example.serviceCall.create.CreateService;

@Service
public class EmployeeService {

	@Autowired
	private ModelMapper modelMapper;

	@Autowired
	EmployeeRepository employeeRepository;
	
	/*
	 * @Autowired EmployeeDataRepository emmployeeDataRepository;
	 * 
	 * @Autowired PersonalDetailRepository personalDetailRepository;
	 */

	@Autowired
	private RestTemplate restTemplate;
	
	@Autowired
	CreateService createService;

	private static final Logger logger = LogManager.getLogger(EmployeeService.class);

	public EmployeeDto createEmployee(EmployeeDto empDto) throws Exception{
		
		
		return (EmployeeDto)createService.CreateTransaction(empDto,EmployeeDto.class, EmployeeDto.class);
	
		
	}
	
	public EmployeePersonalDetailDto createEmployee(EmployeePersonalDetailDto empDto) throws Exception {
		return (EmployeePersonalDetailDto)createService.CreateTransaction(empDto,EmployeePersonalDetailDto.class, EmployeePersonalDetailDto.class);
		
	}

	public EmployeeDto addEmployee(String baseDto) throws Exception {

		//Thread.sleep(7000);
		if (baseDto != null) {
			
			JAXBContext context1 = JAXBContext.newInstance(EmployeeDto.class);
			Unmarshaller unmarshaller = context1.createUnmarshaller();
			StringReader reader = new StringReader(baseDto);
			EmployeeDto empDto = (EmployeeDto) unmarshaller.unmarshal(reader);
			
			if (empDto.getEmployeeId() == null) {
				throw new Exception("Employee id cannot be null!");
			}

			Employee emp = new Employee();
			emp.setEmployeeId(empDto.getEmployeeId());
			emp.setName(empDto.getName());
			emp.setEmail(empDto.getEmail());
			emp.setSalary(empDto.getSalary());
			if(empDto.getIdnumber()!=null)
				emp.setIdnumber(empDto.getIdnumber());
			employeeRepository.save(emp);

			final EmployeeDto dto = this.modelMapper.map(emp, EmployeeDto.class);

			return dto;

		}


		return null;

	}

	public EmployeeDto getEmployeeData(String id) throws Exception {
		Optional<Employee> emp = employeeRepository.findById(id);
		if (!emp.isPresent()) {
			throw new Exception("Employee data is not found!");
		}
		EmployeeDto dto = this.modelMapper.map(emp.get(), EmployeeDto.class);
		return dto;
	}

	public EmployeeDto updateEmployeeDate(EmployeeDto empDto) throws Exception {
		Optional<Employee> emp = employeeRepository.findById(empDto.getEmployeeId());
		if (!emp.isPresent()) {
			throw new Exception("Employee data is not found!");
		}
		Employee empDomain = this.modelMapper.map(empDto, Employee.class);
		empDomain = employeeRepository.save(empDomain);
		EmployeeDto dto = this.modelMapper.map(empDomain, EmployeeDto.class);
		return dto;
	}
}
