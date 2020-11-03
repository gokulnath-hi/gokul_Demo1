package day10;

class NewThread extends Thread {
	 public void run()
	 {
		 try {
			 for(int i=5;i>0;i--) 
			 {
				 System.out.println("Child thread"+i);
			 Thread.sleep(600);
			 }
		 }
		 catch(InterruptedException e) {
			 System.out.println("Child Interrupted");
		 }
		 System.out.println("Child thread Exiting");
	 }
}
public class ExtendThread {

	public static void main(String[] args) {
		
	NewThread t=new NewThread();
	t.setName("Demo Thread");
   System.out.println("Child thread"+t);
   t.start();
   try {
		 for(int i=5;i>0;i--) {
			 System.out.println("Main thread"+i);
		 Thread.sleep(600);}
	 }
	 catch(InterruptedException e) {
		 System.out.println("Main Interrupted");
	 }
	 System.out.println("Main thread Exiting");
}
   
	}


