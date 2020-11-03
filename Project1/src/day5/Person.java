package day5;

public class Person {
	Account acc_holder;
	private String name;
	private int age;
	public Account getAcc_holder() {
		return acc_holder;
	}
	public void setAcc_holder(Account acc_holder) {
		this.acc_holder = acc_holder;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
		
	}
   
public static void main(String args[])
{
	Account a1=new Account();
	SavingsAccount s1,s2=new SavingsAccount();
	a1.setAccNum(1234);
	a1.setBalance(2000d);
	Person p1=new Person ();
    p1.setName("Smith");
    p1.setAge(45);
    p1.setAcc_holder(a1);
    System.out.print(p1.getName()+"\t");
    System.out.print(p1.getAcc_holder().getAccNum());
    a1.deposit(2000d);
    System.out.println("\t"+a1.getBalance());
    Account a2=new Account();
    a2.setAccNum(5678);
    a2.setBalance(2000d);
    Person p2=new Person ();
    p2.setName("Kyathi");
    p2.setAge(40);
    p2.setAcc_holder(a2);
    System.out.print(p2.getName());
    System.out.print("\t"+p2.getAcc_holder().getAccNum());
    s2.setBalance(2000d);
    s2.withdraw(1000);
    
}
}

