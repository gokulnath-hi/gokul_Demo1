package day1;

public class Loop {

	public static void main(String[] args) {
		int N=1;
		System.out.println("N\t10*N\t100*N\t1000*N");
           int a,b,c;
		
		do {
			a=N*10;b=N*100;c=N*1000;
			System.out.printf("%s\t%s\t %s\t %s",N,a,b,c);
			System.out.printf("\n");
			N=N+1;
		}while(N<=5);

	}

}
