package com.eg.eis.pl;
import java.util.Scanner;

import com.cg.eis.bean.Employee;
import com.cg.eis.service.Service;

public class ServiceMain {
	Employee e;
	

	public static void main(String[] args) throws Exception  {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter user id");
		int id = sc.nextInt();
		
		Scanner sc1=new Scanner(System.in);
		System.out.println("enter user name");
		String name = sc1.nextLine();
		
		Scanner sc2=new Scanner(System.in);
		System.out.println("enter user salary");
		int salary = sc2.nextInt();
		
		Scanner sc3=new Scanner(System.in);
		System.out.println("enter user designation");
		String designation = sc3.nextLine();
		
		Scanner sc4=new Scanner(System.in);
		System.out.println("enter user inssurrance detail");
		String insurranceScheame = sc4.nextLine();
		
		Service s=new Service();
		Employee e=new Employee();
		e.setId(id);
		e.setName(name);
		e.setSalary(salary);
		e.setDesignation(designation);
		e.setInsurranceScheame(insurranceScheame);
		//from service class
		s.getEmpDetails( e);
		//s.medicalInsurrance();
		//s.vehicalInsurrance();
	}
	

}
