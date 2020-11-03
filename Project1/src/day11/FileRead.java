package day11;
import java.io.*;
public class FileRead {
   void readFile()  throws IOException
   {
	   FileInputStream f =null;
	   byte b[]=new byte[100];
	   try
	   {
		   f=new FileInputStream ("text1.txt");
		   f.read(b);
		   String str=new String(b);
		   
		   System.out.println(str.trim());
	   }
	   catch(IOException e)
	   {
		   System.out.println(e.getMessage());
	   }
	   finally
	   {
		   f.close();
	   }
   }
	public static void main(String[] args) throws IOException
	{
		FileRead f=new FileRead();
		f.readFile();
		
	}

}
