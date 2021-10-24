package com.cg.eis.service;

import com.cg.eis.bean.Employee;

public class Service implements EmployeeService {
	Employee e;

	public void getEmpDetails(Employee e) {

		System.out.println("Employee [id=" + e.getId() + ", name=" + e.getName() + ", salary=" + e.getSalary()
				+ ", designation=" + e.getDesignation() + ", insurranceScheame=" + e.getInsurranceScheame() + "]");
	}

	@Override
	public void medicalInsurrance() {
		System.out.println("Employee medical inssurance:");
	}

	@Override
	public void vehicalInsurrance() {
		// TODO Auto-generated method stub
		System.out.println("Employee vehical inssurance:");
	}

}
