package com.morsy.silicon.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.morsy.silicon.dao.EmployeeDAO;
import com.morsy.silicon.domain.Employee;
import com.morsy.silicon.service.api.EmployeeService;

/**
 * User: A.Morsy
 * Date: 6/20/13
 */
@Service
public class EmployeeServiceImpl implements EmployeeService {
    
    @Autowired
    private EmployeeDAO employeeDAO;
    

	@Override
	public Employee findByFirstName(String firstName) {
		Employee emp = employeeDAO.findByFirstName(firstName);
		return emp;
	}

	@Override
	public Employee findBylastName(String firstName) {
		Employee emp = employeeDAO.findBylastName(firstName);
		return emp;
	}

	@Override
	public Employee findBysalary(String firstName) {
		Employee emp = employeeDAO.findBylastName(firstName);
		return emp;
	}

	@Override
	public void saveEmployee(Employee emp) {
		try {
			employeeDAO.saveOrUpdate(emp);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

	@Override
	public Employee findByid(long id) {
		Employee emp = null;
		try {
			emp = employeeDAO.findById(id);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return emp;
	}
}
