package day5;

class Account{
long accNum;
double balance;
public long getAccNum() {
	return accNum;
}
public void setAccNum(long accNum) {
	this.accNum = accNum;
}
public double getBalance() {
	return balance;
}
public void setBalance(double balance) {
	this.balance = balance;
}
void deposit(double d) {
	balance=balance+d;
}
void withdraw(double w) {
	balance =balance-w;
}

}
class SavingsAccount extends Account
{
	final double minBalance=1000;
	public void withdraw(double w)
	{
		if(balance>minBalance&&w<balance)
		{
			balance=balance-w;
			System.out.println("\t"+balance);
	    }
		else
			System.out.print("\tInsufficient balance");
			

	}
}
