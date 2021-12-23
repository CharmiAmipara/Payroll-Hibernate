package com.payrollMaven.web;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class EmployeeDetail {
	@Id
	private int Eid;
	private String Name;
	private String Designation;
	private int Salary;
	private String Email;
	private String Password;
	
	public int getEid() {
		return Eid;
	}
	public void setEid(int eid) {
		Eid = eid;
	}	
	public String getName() {
		return Name;
	}
	public void setName(String name) {
		Name = name;
	}
	public String getDesignation() {
		return Designation;
	}
	public void setDesignation(String designation) {
		Designation = designation;
	}
	public int getSalary() {
		return Salary;
	}
	public void setSalary(int salary) {
		Salary = salary;
	}
	public String getEmail() {
		return Email;
	}
	public void setEmail(String email) {
		this.Email = email;
	}
	public String getPassword() {
		return Password;
	}
	public void setPassword(String password) {
		this.Password = password;
	}
	
	@Override
	public String toString() {
		return "EmployeeDetail [Eid=" + Eid + ", Name=" + Name + ", Designation=" + Designation + ", Salary=" + Salary
				+ ", Email=" + Email + ", Password=" + Password + "]";
	}
}