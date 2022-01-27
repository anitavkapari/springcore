package com.springcore.collections;

import java.util.List;
import java.util.Map;
import java.util.Set;

public class Employee {

	private String empName;
	private List<String> phone;
	private Set<String> addresses;
	private Map<String , String> courses;
	
	public Employee() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	public Employee(String empName, List<String> phone, Set<String> addresses, Map<String, String> courses) {
		super();
		this.empName = empName;
		this.phone = phone;
		this.addresses = addresses;
		this.courses = courses;
	}
	
	
	public String getEmpName() {
		return empName;
	}
	public void setEmpName(String empName) {
		this.empName = empName;
	}
	public List<String> getPhone() {
		return phone;
	}
	public void setPhone(List<String> phone) {
		this.phone = phone;
	}
	public Set<String> getAddresses() {
		return addresses;
	}
	public void setAddresses(Set<String> addresses) {
		this.addresses = addresses;
	}
	public Map<String, String> getCourses() {
		return courses;
	}
	public void setCourses(Map<String, String> courses) {
		this.courses = courses;
	}

}
