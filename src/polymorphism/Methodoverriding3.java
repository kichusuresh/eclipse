package polymorphism;

public class Methodoverriding3 {

		public static void main(String[] args) 
		{
			child c=new child();
			c.phone();
		}
	}
	class parent
	{
		public void phone()
		{
			System.out.println("nokia");
		}
	}
	class child extends parent
	{
		public void phone()
		{
			super.phone();
			System.out.println("iphone");
		}
	

	}

