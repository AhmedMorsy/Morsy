package com.morsy.silicon.ws.service.api;

import javax.ws.rs.FormParam;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.MediaType;

import org.springframework.web.bind.annotation.RequestParam;

import com.morsy.silicon.dto.EmployeeDTO;

/**
 * User: A.Morsy Date: 6/27/13
 */
@Path("/")
public interface EmployeeWS {

	@POST
	@Path("/save")
	@Produces(MediaType.APPLICATION_JSON)
	public EmployeeDTO saveEmployee(@FormParam("firstName") String fName,
			@FormParam("lastName") String lName,
			@FormParam("salary") int salary);
	
	
	@GET
	@Path("/getbyid")
	@Produces(MediaType.APPLICATION_JSON)
	public EmployeeDTO getEmpById(@FormParam("id") long id);
}
