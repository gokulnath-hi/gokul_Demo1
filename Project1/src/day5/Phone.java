package day5;

import java.util.Scanner;

public class Phone extends Employee {
	int p[];int phoneID;int no;
	String phoneType;long phoneNo;
	void accept1()
	{
		Scanner sc = new Scanner(System.in);
	       System.out.println("Enter Phone ID : ");
	       phoneID = Integer.parseInt(sc.nextLine());

	       System.out.println("Enter PhoneType : ");
	       phoneType = sc.nextLine();
	       System.out.println("Enter Phone Number : ");
	       phoneNo = Long.parseLong(sc.nextLine());

	}
	void display()          
	   {
	       System.out.println( "Phone ID is"+ phoneID + " \nPhone type is " +phoneType+"\nPhone Number is "+phoneNo );
	   }
	
	public static void main(String[] args) {
		
		System.out.println("No of inputs");
		Scanner e=new Scanner(System.in);
		int n=e.nextInt();
		Employee []e1=new Employee[n];
	       for(int i = 0; i < n; i++)
            e1[i] = new Employee();
	       for(int i=0;i<n;i++)
	        {
	            System.out.println("Enter details of Employee"+ (i+1) );
	            e1[i].accept();
	        }
	       for(int i=0;i<n;i++)
	        {
	            e1[i].display();
	        }
	       
	       System.out.println("No of phones");
	       int no=e.nextInt();
	       if(no==0)
	    	   System.out.println("0 Phones");
	       
	       Phone p[]=new Phone[no];
	      // Phone p1[]=new Phone[n];
	       
	       for(int i = 0; i < no; i++)
	            p[i] = new Phone(); 
	       for(int k=0;k<n;k++)
	       {
		       for(int i=0;i<no;i++)
		        {
		            System.out.println("Enter details of Employee"+k+1+" Phone Details "+(i+1));
		            p[i].accept1();
		        }
		       for(int i=0;i<no;i++)
		        {
		    	   System.out.println("Details of Employee"+(k+1)+" Phone Details "+(i+1));
		         		 p[i].display();
		        }
		       

}
}
}