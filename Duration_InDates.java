package com.java.program;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.Period;
import java.util.Date;                                                       
import java.util.Scanner;
public class Duration_InDates {

	
		   public static void main(String[] args) throws ParseException {
			  // Date date1=null;
			//   Date date2=null;
			   
		      /*  Scanner input = new Scanner(System.in);
		        SimpleDateFormat format = new SimpleDateFormat("dd/MM/yyyy");
		        System.out.println("Enter check-in date1 (gg/aa/yy):");
		        String cinput1 = input.nextLine();
		        
		        System.out.println("Enter check-in date2 (gg/aa/yy):");
		        String cinput2 = input.nextLine();
		        if(null != cinput1 && cinput1.trim().length() > 0){
		             date1 = format.parse(cinput1);//to convert string into date
		            // date2 = format.parse(cinput2);
		        }
		        if(null != cinput2 && cinput2.trim().length() > 0){
		             date2 = format.parse(cinput1);//to convert string into date
		            // date2 = 
		        Period p = Period.between(date1, date2);
			      System.out.println("Period = "+p);
		        */
		      LocalDate date11 = LocalDate.of(2019, 3, 25);
		      LocalDate date21 = LocalDate.of(2019, 4, 29);
		      System.out.println("Date 1 = "+date11);
		      System.out.println("Date 2 = "+date21);
		      Period p = Period.between(date11, date21);
		      System.out.println("Period = "+p);
		      System.out.println("Years (Difference) = "+p.getYears());
		      System.out.println("Month (Difference) = "+p.getMonths());
		      System.out.println("Days (Difference) = "+p.getDays());
		   }
		
	}


