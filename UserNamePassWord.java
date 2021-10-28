package com.java.lambda;
import java.util.Scanner;

interface Validation {

	boolean valid (String username,String password);
}
/*interface Validation {
	boolean userpass_validation(String username, String password);
}

public class UserNamePassWord {

	public static void main(String[] args) {
		
		Validation v = (username, password) -> {//lambda expression
			return( (username.equals("pratap") && password.equals("akhade")));
			
		};
		v.userpass_validation("smitali", "tutare");
	}

}*/

public class UserNamePassWord{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		Validation v = (username,password)->{ // using lambda
			return (username.equals("Pratap") && password.equals("pratap145")); // matches username and password to user enter username and pass
		};
		
		System.out.print("Enter the username : ");
		String username=sc.next();
		
		System.out.print("Enter the password : ");
		String password=sc.next();
		
		System.out.println("\nAuthentication Status : "+v.valid (username, password));
		sc.close();
	}

}