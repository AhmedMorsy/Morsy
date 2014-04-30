package com.morsy.silicon.dto;

import com.pearlox.framework.dto.BasicDTO;

import javax.xml.bind.annotation.XmlRootElement;

/**
 * User: A.Morsy
 * Date: 6/27/13
 */
@XmlRootElement
public class EmployeeDTO extends BasicDTO {
    
    private Long id;
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	private String firstName;
    private String lastName;
    private int salary;
    
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public int getSalary() {
		return salary;
	}
	public void setSalary(int salary) {
		this.salary = salary;
	}

   
}
