package com.morsy.silicon.ws.service.impl;

import org.springframework.beans.factory.annotation.Autowired;

import com.morsy.silicon.domain.Employee;
import com.morsy.silicon.dto.EmployeeDTO;
import com.morsy.silicon.service.api.EmployeeService;
import com.morsy.silicon.ws.service.api.EmployeeWS;

/**
 * User: A.Morsy Date: 6/27/13
 */
public class EmployeeWSImpl implements EmployeeWS {

	@Autowired
	private EmployeeService employeeService;

	@Override

	public EmployeeDTO saveEmployee(String fName,
			String lName, int salary) {
		Employee emp = new Employee();
		emp.setFirstName(fName);
		emp.setLastName(lName);
		emp.setSalary(salary);

		employeeService.saveEmployee(emp);
		EmployeeDTO empDTO = new EmployeeDTO();
		
		empDTO.setId(emp.getId());
		empDTO.setFirstName(emp.getFirstName());
		empDTO.setLastName(emp.getLastName());
		empDTO.setSalary(emp.getSalary());
		
		return empDTO;
	}
	

	@Override
	public EmployeeDTO getEmpById(long id) {
		
		Employee emp =employeeService.findByid(id);
		EmployeeDTO empDTO = new  EmployeeDTO();
		
		empDTO.setId(emp.getId());
		empDTO.setFirstName(emp.getFirstName());
		empDTO.setLastName(emp.getLastName());
		empDTO.setSalary(emp.getSalary());
		return empDTO;
	}
	
}
