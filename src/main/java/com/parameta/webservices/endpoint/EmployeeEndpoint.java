package com.parameta.webservices.endpoint;

import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ws.server.endpoint.annotation.Endpoint;
import org.springframework.ws.server.endpoint.annotation.PayloadRoot;
import org.springframework.ws.server.endpoint.annotation.RequestPayload;
import org.springframework.ws.server.endpoint.annotation.ResponsePayload;

import com.parameta.webservices.employe.AddEmployeeRequest;
import com.parameta.webservices.employe.AddEmployeeResponse;
import com.parameta.webservices.service.EmployeeService;

@Endpoint
public class EmployeeEndpoint {
	
	private final static Logger log = Logger.getLogger("com.parameta.webservices.endpoint");
	
	@Autowired
	private EmployeeService employeeService;

	/**
	 * 
	 * @param addEmployee
	 * @return
	 */
	@PayloadRoot(namespace = "http://www.parameta.com/webservices/employe", localPart = "addEmployeeRequest")
	public @ResponsePayload AddEmployeeResponse addEmployee(@RequestPayload AddEmployeeRequest addEmployee) {
		log.log(Level.INFO, addEmployee.getEmployee().toString());
		AddEmployeeResponse response =new AddEmployeeResponse();
		if(employeeService.addEmployee(addEmployee.getEmployee())) {
			response.setAddedDate(new Date());
			response.setStatus(true);			
		}else {
			response.setAddedDate(null);
			response.setStatus(false);		
		}
		return response;

	}

}
