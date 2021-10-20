import java.util.Scanner;

public class Power{



  public static void main(String[] args){

    Scanner sc=new Scanner(System.in);
    System.out.println("Enter Number from User:");
    int number=sc.nextInt();
    
    System.out.println(powerOf2(1));
  }
  
  private static boolean powerOf2(int number){
   if(number==0) {
    return false;
   }
    
   while(number !=1) {
	   number=number/2;
   
    if(number % 2!= 0 && number!=1) {
     return false;
    }
    
   }
   return true;
  }
  
 
 }

