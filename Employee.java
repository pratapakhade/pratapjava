/*create packages and classes as given below:
a	com.cg.eis.bean
	In this package, create “Employee” class with different attributes such as id, name, salary, designation, insuranceScheme.
b	com.cg.eis.service
		This package will contain code for services offered in Employee Insurance System. The service class will have one EmployeeService Interface and its corresponding implementation class.
The services offered by this class are:
i	Get employee details from user.
ii	Find the insurance scheme for an employee based on salary and designation.
iii	Display all the details of an employee.
c	com.cg.eis.pl
		This package will contain code for getting input from user, produce expected output to the user and invoke services offered by the system. 
*/



package com.cg.eis.bean;

public class Employee {
private int id;
private String name;
private int salary;
private String designation;
private String insurranceScheame;
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
public int getSalary() {
	return salary;
}
public void setSalary(int salary) {
	this.salary = salary;
}
public String getDesignation() {
	return designation;
}
public void setDesignation(String designation) {
	this.designation = designation;
}
public String getInsurranceScheame() {
	return insurranceScheame;
}
public void setInsurranceScheame(String insurranceScheame) {
	this.insurranceScheame = insurranceScheame;
}
@Override
public String toString() {
	return "Employee [id=" + id + ", name=" + name + ", salary=" + salary + ", designation=" + designation
			+ ", insurranceScheame=" + insurranceScheame + "]";
}
 
}

