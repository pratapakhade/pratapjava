package com.java.programs;

public class Student extends Person_Parent {
      
	int sId;
	
	void study() {
		System.out.println(" child study: ");
	}
	


	


	public static void main(String[] args) {
		Student s=new Student();
        s.study();
        
     Person_Parent p= new Student();
       p.eat();
       // p.study(); // we cannot access child methods by parent reference
	}

}
