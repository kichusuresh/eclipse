package inheritance.java;
public class Singleinheritance {
	public static void main(String[] args) {
		cat c=new cat();
		c.sleeping();
		c.barking();
	}
}
class dog
{
	public void barking()
	{
		System.out.println("dog is barking");
	}
}
class cat extends dog
{
	public void sleeping()
	{
		System.out.println("cat is sleeping");

	}

}
