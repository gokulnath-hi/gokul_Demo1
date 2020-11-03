package day11;

import java.io.*;
import java.util.*;

public class ByteReadWrite {
	static  FileInputStream f =null;
	 static FileOutputStream fout=null;
	 static String str=new String();
     void readFile() throws IOException
     {
    	
  	   byte b[]=new byte[100];
  	   System.out.println("After reading");
  	   try
  	   {
  		   f.read(b);
  		   String str=new String(b);
  		   
  		   System.out.println(str.trim());
  	   }
  	   catch(IOException e)
  	   {
  		   System.out.println(e.getMessage());
  	   }
     }
     void writeFile() throws IOException
     {
    	 //byte b[]=new byte[100];
 		
 		try
 		{
 			 
 			Scanner sc=new Scanner(System.in);
 			System.out.println("Enter the text");
 			String str=sc.nextLine();
 			
 			fout.write(str.getBytes());
 			fout.write("\r\n".getBytes());
 		}
 		catch(IOException e){
 			e.printStackTrace();
 		}
 		}

  void closeFile() throws IOException
  {
	  f.close();
	  fout.close();
  }

	public static void main(String[] args) throws IOException {
		String c;
		ByteReadWrite a=new ByteReadWrite();
		fout=new FileOutputStream ("text3.txt");
		f=new FileInputStream ("text3.txt");
		do {
		a.writeFile();
		a.readFile();
		
		System.out.println("Do you want to continue");
		Scanner sc=new Scanner(System.in);
		c=sc.nextLine();
		}while(c.equals("Y"));
		
		System.out.println("It ends");
		a.closeFile();
		
	}

}
