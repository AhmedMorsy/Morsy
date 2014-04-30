package com.morsy.silicon.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

import com.pearlox.framework.domain.BasicObject;

/**
 * User: A.Morsy
 * Date: 23/4/14
 */
@SuppressWarnings("serial")
@Entity
@Table(name = "employee")
public class Employee extends BasicObject {


	private String firstName;
    private String lastName;
    private int salary;
    
    @Column(name = "first_name")
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	 @Column(name = "last_name")
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	 @Column(name = "salary")
	public int getSalary() {
		return salary;
	}
	public void setSalary(int salary) {
		this.salary = salary;
	}
   
//	public Long getId(){
//		return id;
//	}
   
}
