package com.example.serviceCall.Repository;

import org.springframework.data.repository.CrudRepository;

import com.example.serviceCall.Domain.Employee;

public interface EmployeeRepository extends CrudRepository<Employee, String>   {

}
