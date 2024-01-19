package inheritance.java;
public class Bank {
	public static void main(String[] args)
	{
				Sbi n=new Sbi();
				n.deposit();
				n.withdraw();
				n.sbiinterest();
				Hdfc h=new Hdfc();
				h.deposit();
				h.withdraw();
				h.loan();
			}
		}
class Bankdetails {
	public void withdraw()
	{
		System.out.println("withdraw");
	}
	public void deposit()
	{
		System.out.println("deposit");
	}
}
class Sbi extends Bank
{
	public void sbiinterest()
	{
		System.out.println("sbiinterest");
	}

	public void withdraw() {
		// TODO Auto-generated method stub
		
	}

	public void deposit() {
		// TODO Auto-generated method stub
		
	}
}
class Hdfc extends Bank
{
	public void loan()
	{
		System.out.println("hdfcloan");
	}

	public void withdraw() {
		// TODO Auto-generated method stub
		
	}

	public void deposit() {
		// TODO Auto-generated method stub
		
	}



	}


