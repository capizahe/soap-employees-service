package com.parameta.webservices.service;

import java.util.logging.Level;
import java.util.logging.Logger;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.parameta.webservices.dao.EmployeeRepository;
import com.parameta.webservices.employe.Employee;
import com.parameta.webservices.mapper.WebServiceMapper;

@Service
public class EmployeeService{
	
	private final static Logger log = Logger.getLogger("com.parameta.webservices.service");
	
	@Autowired
	public EmployeeRepository employeeRepository;
	
	/**
	 * This method adds the current employee to the database
	 * @param employee
	 * @return boolean true if the operation was successful, false if not.
	 */
	public boolean addEmployee(Employee employee) {
		log.log(Level.INFO, employee.toString());
		com.parameta.webservices.model.Employee new_employee =WebServiceMapper.mapWsEmployee(employee);
		log.log(Level.INFO, new_employee.toString());
		return employeeRepository.save(new_employee) != null;
	}

}
