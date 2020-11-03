package day11;
import java.io.*;
import java.util.*;

public class FileWrite {

	public static void main(String[] args) {
		
		byte b[]=new byte[100];
		FileOutputStream fout=null;
		try
		{
			Scanner sc=new Scanner(System.in);
			System.out.println("Enter the text");
			String str=sc.nextLine();
			fout=new FileOutputStream("text1.txt",true);
			fout.write(str.getBytes());
			fout.write("\r\n".getBytes());
			fout.close();
		}
		catch(IOException e){
			e.printStackTrace();
		}
		finally
		{
			try {
				fout.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}

}
