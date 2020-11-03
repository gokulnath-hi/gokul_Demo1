/*A BufferedWriter is simply a Writer which uses a character buffer for 
increased efficiency when
 writing data.*/
 package day11;
import java.io.*;
import java.util.*;
public class SourceReader{
	
public void readFile() throws IOException
	{
		try {
		      FileReader file = new FileReader("text1.txt");
		      BufferedReader buff =  new BufferedReader(file);
		      boolean eof = false;
		      while (eof!=true) {
		        String line = buff.readLine(); 
		        if (line == null)
		          eof = true;
		      // else if (line.contains("class"))
		       else
		          System .out.println(line);
		      }
		      buff.close();
		    } catch (IOException e) {
		      e.printStackTrace();
		    }
		  }

	
	
  public static void main(String[] args) throws IOException {
	  
	  SourceReader obj=new SourceReader();
	  obj.readFile();
 
  }
}

