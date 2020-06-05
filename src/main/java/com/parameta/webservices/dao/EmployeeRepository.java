package com.parameta.webservices.dao;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.parameta.webservices.model.Employee;

@Repository
public interface EmployeeRepository extends CrudRepository<Employee, Long> {

}
