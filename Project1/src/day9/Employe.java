package day9;

public class Employe {
	private int empid;
	String name;
			
		public Employe(int empid,String name)
		{
			this.empid=empid;
			this.name=name;
		}
		public int hashCode()
		{
			return 10;
		}
		public  boolean equals(Object ob)
		{
			boolean flag=false;
			Employe e=(Employe)ob;
			if((this.empid==e.empid )&& ((this.name) .equals(e.name)))
				flag=true;
			return flag;
		}
		
	

}

