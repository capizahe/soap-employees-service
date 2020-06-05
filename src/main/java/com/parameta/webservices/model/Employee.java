package com.parameta.webservices.model;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table(name="employees")
public class Employee implements Serializable {

	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	@Column(name = "first_name")
	private String firstName;

	@Column(name = "second_name")
	private String secondName;

	@Column(name = "first_surname")
	private String firstSurname;
	
	@Column(name = "second_surname")	
	private String secondSurname;
	
	@Column(name = "id_type")
	private String idType;
	
	@Column(name = "id_number")
	private String idNumber;
	
	@Column(name = "birth_date")
	private Date birthDate;

	@Column(name = "company_vinculation_date")
	private Date vinculationDate;

	@Column(name = "company_position")
	private String companyPosition;
	
	@Column(name = "salary")
	private Double salary;

	public Employee(String firstName, String secondName, String idType, String idNumber, Date vinculationDate,
			Date birthDate, String companyPosition, Double salary) {
		super();
		this.firstName = firstName;
		this.secondName = secondName;
		this.idType = idType;
		this.idNumber = idNumber;
		this.vinculationDate = vinculationDate;
		this.birthDate = birthDate;
		this.companyPosition = companyPosition;
		this.salary = salary;
	}
	
	public Employee() {
		super();
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getSecondName() {
		return secondName;
	}

	public void setSecondName(String secondName) {
		this.secondName = secondName;
	}

	public String getFirstSurname() {
		return firstSurname;
	}

	public void setFirstSurname(String firstSurname) {
		this.firstSurname = firstSurname;
	}

	public String getSecondSurname() {
		return secondSurname;
	}

	public void setSecondSurname(String secondSurname) {
		this.secondSurname = secondSurname;
	}

	public String getIdType() {
		return idType;
	}

	public void setIdType(String idType) {
		this.idType = idType;
	}

	public String getIdNumber() {
		return idNumber;
	}

	public void setIdNumber(String idNumber) {
		this.idNumber = idNumber;
	}

	public Date getBirthDate() {
		return birthDate;
	}

	public void setBirthDate(Date birthDate) {
		this.birthDate = birthDate;
	}

	public Date getVinculationDate() {
		return vinculationDate;
	}

	public void setVinculationDate(Date vinculationDate) {
		this.vinculationDate = vinculationDate;
	}

	public String getCompanyPosition() {
		return companyPosition;
	}

	public void setCompanyPosition(String companyPosition) {
		this.companyPosition = companyPosition;
	}

	public Double getSalary() {
		return salary;
	}

	public void setSalary(Double salary) {
		this.salary = salary;
	}

	@Override
	public String toString() {
		return "Employee [firstName=" + firstName + ", secondName=" + secondName + ", firstSurname="
				+ firstSurname + ", secondSurname=" + secondSurname + ", idType=" + idType + ", idNumber=" + idNumber
				+ ", birthDate=" + birthDate + ", vinculationDate=" + vinculationDate + ", companyPosition="
				+ companyPosition + ", salary=" + salary + "]";
	}
	
	

}
