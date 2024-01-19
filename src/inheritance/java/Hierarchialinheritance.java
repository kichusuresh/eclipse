package inheritance.java;

public class Hierarchialinheritance {

	public static void main(String[] args)
	{
				catss c=new catss();
				c.eating();
				c.sleeping();
				lions d=new lions();
				d.eating();
				d.running();
			}
		}
		class dogss
		{
			public void eating()
			{
				System.out.println("dog is eating");
			}
		}
		class catss extends dogss
		{
			public void sleeping()
			{
				System.out.println("cat is sleeping");
			}
		}
		class lions extends dogss
		{
			public void running()
			{
				System.out.println("lion is running");
			}

	}



