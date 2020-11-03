package day3;
import java.util.Scanner;

public class Student {
   int studID;String studName;
   void accept()
	  {
	   Scanner sc = new Scanner(System.in);
       System.out.println("Enter Student ID : ");
       studID = Integer.parseInt(sc.nextLine());

       System.out.println("Enter Student Name : ");
       studName = sc.nextLine();

	  }
   void display()          
   {
       System.out.println( "Student ID is"+ studID + " \nStudent name is " +studName );
   }

	public static void main(String[] args) {
		System.out.println("No of inputs");
		Scanner e=new Scanner(System.in);
		int n=e.nextInt();
		Student []s=new Student[n];
	       for(int i = 0; i < n; i++)
            s[i] = new Student();
		for(int i=0;i<n;i++)
        {
            System.out.println("Enter details of Student"+ (i+1) );
            s[i].accept();
        }
		for(int i=0;i<n;i++)
        {
            s[i].display();
        }

}
}
