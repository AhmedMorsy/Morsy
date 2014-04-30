package com.morsy.silicon.web.controller;

import javax.jws.WebParam.Mode;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.morsy.silicon.domain.EmployeeDTO;
import com.morsy.silicon.service.api.EmployeeService;

/**
 * User: A.Morsy Date: 24/4/14
 */
@Controller
public class EmployeeController {

	@Autowired
	private EmployeeService employeeService;

	@RequestMapping(value = "/index", method = RequestMethod.GET)
	public String home() {
		return "index";
	}

	@RequestMapping(value = "/addemp", method = RequestMethod.GET)
	public String addForm() {
		return "submitform";
	}

	@RequestMapping(value = "/addemp", method = RequestMethod.POST)
	public String addemp(
			@RequestParam(value = "firstName", required = true) final String firstName,
			@RequestParam(value = "lastName", required = true) final String lastName,
			@RequestParam(value = "salary", required = true) final String salary,
			Model model) {
		// call webservice
		// 3abby el DTO
		// Put DTO on Model
		// model.addAttribute("", DTO);

		EmployeeDTO emp = employeeService.saveEmployee(firstName, lastName,
				salary);

		model.addAttribute("emp", emp);
		if (emp != null) {
			return "partialwelcome";
		} else {
			return "error";
		}

	}

	@RequestMapping(value = "/getbyid", method = RequestMethod.GET)
	public String getByIdForm() {
		return "getbyidform";
	}

	@RequestMapping(value = "/getbyid", method = RequestMethod.POST)
	public String getById(
			@RequestParam(value = "id", required = true) final String id,
			Model model) {
		EmployeeDTO emp = employeeService.getEmpById(id);
		if (emp != null) {
			model.addAttribute("emp", emp);
			return "getbyid";
		} else {
			return "error";
		}
	}
}
