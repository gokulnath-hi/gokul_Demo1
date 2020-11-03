package day10;

public class MainClass {

	public static void main(String[] args) {
		int x = 0;
	    Addition sum = new Addition(x);

	    Thread t1 = new Thread(sum);
	    Thread t2 = new Thread(sum);
	    Thread t3 = new Thread(sum);
	    Thread t4 = new Thread(sum);
	    Thread t5 = new Thread(sum);

	    t1.start();
	    t2.start();
	    t3.start();
	    t4.start();
	    t5.start();

	    try 
	    {
	        t1.join();
	        t2.join();
	        t3.join();
	        t4.join();
	        t5.join();
	    } catch (InterruptedException e) 
	    {
	        System.out.println(e);
	    }
	    System.out.print("Sum of 5 threads: " + sum.a);

	}

}
