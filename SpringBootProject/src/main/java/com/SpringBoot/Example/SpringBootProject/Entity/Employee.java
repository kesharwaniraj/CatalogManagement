package com.SpringBoot.Example.SpringBootProject.Entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="employee")
public class Employee {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="emp_id")
	private int id;
	
	@Column(name="emp_name")
	private String name;
	
	@Column(name="emp_Add")
	private String Address;
	
	@Column(name="emp_age")
	private int age;
	
	@Column(name="emp_salary")
	private int salary;
	
	
	public Employee(){}
	
	public Employee(String name, String address, int age, int salary) {
		super();
		this.name = name;
		Address = address;
		this.age = age;
		this.salary = salary;
	}

	public int getSalary() {
		return salary;
	}

	public void setSalary(int salary) {
		this.salary = salary;
	}

	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public String getAddress() {
		return Address;
	}


	public void setAddress(String address) {
		Address = address;
	}


	public int getAge() {
		return age;
	}


	public void setAge(int age) {
		this.age = age;
	}

	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", Address=" + Address + ", age=" + age + ", salary="+ salary+ "]";
	}
	
	
	

}
