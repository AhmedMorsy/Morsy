package com.morsy.silicon.service.api;

import com.morsy.silicon.domain.EmployeeDTO;


/**
 * User: Andrew
 * Date: 6/20/13
 */
public interface EmployeeService {
    
    public EmployeeDTO saveEmployee(String fName, String lName, String salary);
    public EmployeeDTO getEmpById(String id);
}
