package com.morsy.silicon.dao;

import com.morsy.silicon.domain.Employee;
import com.pearlox.framework.dao.BasicDao;

/**
 * User: Andrew
 * Date: 6/18/13
 */
public interface EmployeeDAO extends BasicDao<Employee> {
    
    public Employee findByFirstName(String firstName);
    
    public Employee findBylastName(String firstName);
    
    public Employee findBysalary(String firstName);

}
