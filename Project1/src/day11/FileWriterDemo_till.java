package day11;
import java.util.*;
import java.io.*;
public class FileWriterDemo_till {
	
	  FileWriter fw =null;
	  BufferedWriter bw=null;
	
	  public void init() throws IOException
	{
		
		    fw = new FileWriter("out.txt");  
	        bw=new BufferedWriter(fw);
		
	}
	  
	  
	public void writeFile() //throws IOException  
	{
		 
		 Scanner scan=new Scanner(System.in);
		   
		    String s=" ";
		    try {
		          
		     while (!s.equals("q") )
		    	 
		  { 
		     s=scan.nextLine();
		  if (!s.equals("q"))
		   {
		    
		     bw.write(s);
		     bw.newLine();
				  
		}
		} 
		      
		    } catch(IOException e) {
		      System.out.println(e);
		    }	
			}
	
	
	void close() throws IOException
	{
		
		 bw.close();  	
	}
	
public static void main(String[] args) throws IOException {
	  
	  FileWriterDemo_till obj=new FileWriterDemo_till();
	  obj.init();
	  obj.writeFile();
	  obj.close();

}
}


