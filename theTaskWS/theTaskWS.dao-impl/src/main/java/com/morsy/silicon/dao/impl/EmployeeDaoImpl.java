package com.morsy.silicon.dao.impl;

import javax.persistence.Query;

import org.springframework.stereotype.Repository;

import com.morsy.silicon.dao.EmployeeDAO;
import com.morsy.silicon.domain.Employee;
import com.pearlox.framework.dao.impl.BasicJpaDao;

/**
 * User: A.Morsy Date: 6/18/13
 */
@Repository
public class EmployeeDaoImpl extends BasicJpaDao<Employee> implements
		EmployeeDAO {
	public EmployeeDaoImpl() {
		super(Employee.class);
	}
	
	@Override
	public Employee findById(Long id) {
		Query query = getEntityManager().createQuery(
				"from Employee where id = :id");
		query.setParameter("id", id);
		return (Employee) query.getSingleResult();
	}

	@Override
	public Employee findByFirstName(String firstName) {
		Query query = getEntityManager().createQuery(
				"from Employee where first_name = :firstName");
		query.setParameter("firstName", firstName);
		return (Employee) query.getSingleResult();
	}

	@Override
	public Employee findBylastName(String lastName) {
		Query query = getEntityManager().createQuery(
				"from Employee where last_name = :lastName");
		query.setParameter("last_name", lastName);
		return (Employee) query.getSingleResult();
		
	}

	@Override
	public Employee findBysalary(String salary) {
		Query query = getEntityManager().createQuery(
				"from Employee where salary = :salary");
		query.setParameter("salary", salary);
		return (Employee) query.getSingleResult();
		
	}
}
