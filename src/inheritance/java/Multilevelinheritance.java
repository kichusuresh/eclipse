package inheritance.java;
public class Multilevelinheritance {
	public static void main(String[] args) {
		cats c=new cats();
		c.sleeping();
		c.braking();
		lion l=new lion();
		l.running();
		l.braking();
		l.sleeping();
	}
}
class dogs
{
	public void braking()
	{
		System.out.println("dog is braking");	
	}
}
class cats extends dogs
{
	public void sleeping()
	{
		System.out.println("cat is sleeping");
	}
}
class lion extends cats
{
	public void running()
	{
		System.out.println("lion is running");
	}

	}

