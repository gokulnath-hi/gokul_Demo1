package day2;

public class Object {
	Integer meth1(double d)
	{  
		int n=(int)d;
    	return n;
		
	}
	float meth2(Integer c)
	{
		float j=c.intValue();
		return j;
		
	}

	public static void main(String[] args) {
		Object o1=new Object();
		System.out.println(o1.meth1(22.5));
		System.out.println(o1.meth2(23));
		
	}
	
	}


