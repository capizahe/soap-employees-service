package com.parameta.webservices.mapper;

import com.parameta.webservices.model.Employee;

public class WebServiceMapper {

	/**
	 * This method recieves an WebService model employee and converts it into a Entity employee to store in the database.
	 * @param employee
	 * @return Entity employee
	 */
	public static Employee mapWsEmployee(com.parameta.webservices.employe.Employee employee) {
		Employee entityEmployee = new Employee();
		entityEmployee.setFirstName(employee.getFirstName());
		entityEmployee.setSecondName(employee.getSecondName());
		entityEmployee.setFirstSurname(employee.getFirstSurname());
		entityEmployee.setSecondSurname(employee.getSecondSurname());
		entityEmployee.setIdType(employee.getIdType());
		entityEmployee.setIdNumber(employee.getIdNumber());
		entityEmployee.setBirthDate(employee.getBirthDate().toGregorianCalendar().getTime());
		entityEmployee.setVinculationDate(employee.getBirthDate().toGregorianCalendar().getTime());
		entityEmployee.setCompanyPosition(employee.getCompanyPosition());
		entityEmployee.setSalary(employee.getSalary());
		return entityEmployee;
		
	}
	
}
