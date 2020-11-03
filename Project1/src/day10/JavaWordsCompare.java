package day10;

import java.util.*;
import java.text.*;

public class JavaWordsCompare {

	public static void main(String[] args) {
		
		Word st1=new Word ("Guava");

		Word st2=new Word("apple");

		Word st3=new Word("Lemon");

		Word st4=new Word("orange");

		 List<Word> ls=new ArrayList<Word>();

		ls.add(st1);

		ls.add(st2);

		ls.add(st3);

		ls.add(st4); 

		Collections.sort(ls);

		Iterator<Word> itr = ls.iterator();  

		 while(itr.hasNext()){

		Object element = itr.next();

		Word st=(Word)element;

		System.out.println("name ::"+st.name);

		 
		}

		}


}
		class Word implements Comparable {

		String name;

		Word(String name)
		{
		 this.name=name;
		}

		public int compareTo(Object o)
		  
		{
			int i=name.compareToIgnoreCase(((Word)o).name);
			 if(i==0) return 0;
			 else if(i>0) return 1;
			 else return -1;
		
		}
		
}