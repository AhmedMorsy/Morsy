package com.morsy.silicon.service.api;

import com.morsy.silicon.domain.Employee;

/**
 * User: A.Morsy
 * Date: 6/20/13
 */
public interface EmployeeService {
    
	 
	public Employee findByid(long id);
	
	public Employee findByFirstName(String firstName);
    
    public Employee findBylastName(String firstName);
    
    public Employee findBysalary(String firstName);
    
    public void saveEmployee(Employee emp);

}
