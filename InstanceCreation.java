/*(Hint: Create any Write a class with main method
 *  to demonstrate instance creation using method reference.
 *  simple class with attributes and getters and setters)
 */
package com.java.lambda;

interface Methodreff {
	void sayHi();
}

public class InstanceCreation {
	private int id;
	private String name;

	// public static void saySomething() {
	// System.out.println("inside the static method");
	// }

	public void saySomething() {
		System.out.println("inside the static method");
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

	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + "]";
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		InstanceCreation mr = new InstanceCreation();
		Methodreff mt = mr::saySomething;
		mt.sayHi();
		// Methodreff mr = InstanceCreation::saySomething;
		// mr.sayHi();

	}
}