package inheritance.java;
		interface Bank1
		{
			void deposit();
			void withdraw();
		}
		interface Bank2
		{
			void interestrate();
			void balancedetails();
		}
		class ICICI implements Bank1,Bank2
		{

			@Override
			public void interestrate() {
				// TODO Auto-generated method stub
				System.out.println("interestrate");
			}

			@Override
			public void balancedetails() {
				// TODO Auto-generated method stub
				System.out.println("balancedetails");
			}

			@Override
			public void deposit() {
				// TODO Auto-generated method stub
				System.out.println("deposit");
			}

			@Override
			public void withdraw() {
				// TODO Auto-generated method stub
				System.out.println("withdraw");
			}
			
		}
		public class Multipleinheritance {

			public static void main(String[] args) {
				// TODO Auto-generated method stub
				ICICI OB=new ICICI();
				OB.balancedetails();
				OB.deposit();
				OB.interestrate();
				OB.withdraw();

			}
		}

	

