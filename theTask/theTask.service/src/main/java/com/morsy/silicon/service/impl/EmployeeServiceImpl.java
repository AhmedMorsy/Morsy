package com.morsy.silicon.service.impl;

import org.apache.commons.httpclient.HttpClient;
import org.apache.commons.httpclient.HttpStatus;
import org.apache.commons.httpclient.NameValuePair;
import org.apache.commons.httpclient.methods.GetMethod;
import org.apache.commons.httpclient.methods.PostMethod;
import org.codehaus.jackson.map.ObjectMapper;
import org.springframework.stereotype.Service;

import com.morsy.silicon.domain.EmployeeDTO;
import com.morsy.silicon.service.api.EmployeeService;

/**
 * User: A.Morsy Date: 24/4/14
 */
@Service
public class EmployeeServiceImpl implements EmployeeService {

	@Override
	public EmployeeDTO saveEmployee(final String fName, String lName,
			String salary) {

		String saveEmp = null;
		EmployeeDTO dto = null;
		EmployeeDTO paramsDTO = null;

		PostMethod postMethod = new PostMethod("http://localhost:8091/api/save");
		HttpClient client = new HttpClient();

		NameValuePair fNameParam = new NameValuePair("firstName", fName);
		NameValuePair lNameParam = new NameValuePair("lastName", lName);
		NameValuePair salaryParam = new NameValuePair("salary", salary);

		postMethod.setRequestHeader("Content-Type",
				"application/x-www-form-urlencoded");

		NameValuePair[] namedParameter = new NameValuePair[3];
		namedParameter[0] = fNameParam;
		namedParameter[1] = lNameParam;
		namedParameter[2] = salaryParam;

		postMethod.setRequestBody(namedParameter);

		try {
			int status = client.executeMethod(postMethod);
			if (status == HttpStatus.SC_OK) {
				EmployeeDTO emp = new ObjectMapper()
						.readValue(postMethod.getResponseBodyAsString(),
								EmployeeDTO.class);
				// Params DTO
				// paramsDTO.setFirstName(fName);
				// paramsDTO.setLastName(lName);
				// paramsDTO.setSalary(Integer.parseInt(salary));
				//
				for (int i = 0; i < 10; i++) {
					System.out.println(emp.getFirstName() + " "
							+ emp.getLastName() + " " + emp.getSalary());
					// params DTO
					// System.out
					// .println("request params : "+paramsDTO.getFirstName()+" "+paramsDTO.getLastName()+" "+paramsDTO.getSalary());
				}

				return emp;

			} else {

			}
		} catch (Exception e) {

			e.printStackTrace();

		}

		return null;

	}

	@Override
	public EmployeeDTO getEmpById(String id) {

		GetMethod getMethod = new GetMethod(
				"http://localhost:8091/api/getbyid?id=" + id);
		HttpClient client = new HttpClient();

		try {
			int status = client.executeMethod(getMethod);
			if (status == HttpStatus.SC_OK) {

				EmployeeDTO empDto = new ObjectMapper().readValue(
						getMethod.getResponseBodyAsString(), EmployeeDTO.class);
				return empDto;
			} else {

			}
		} catch (Exception e) {
			e.printStackTrace();

		}
		return null;
	}

}