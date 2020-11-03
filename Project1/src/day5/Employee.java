package day5;

import java.util.Scanner;

public class Employee {
    int []e1;int empID;
    String empName;
    void accept()
	  {
	   Scanner sc = new Scanner(System.in);
     System.out.println("Enter Employee ID : ");
     empID = Integer.parseInt(sc.nextLine());

     System.out.println("Enter Employee Name : ");
     empName = sc.nextLine();

	  }
    void display()          
	   {
	       System.out.println( "Employee ID is"+ empID + " \nEmployee name is " +empName );
	   }
	
	
		
	}
	
	

