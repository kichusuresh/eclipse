package extra;
public class Membersdetail
{
	public static void main(String[] args) 
	{
			worker w=new worker();
			w.name="anju";
			w.age=22;
			w.address="pullikattil";
			w.salary=90000;
			w.printdetails();
			w.specialization="testing";
			System.out.println("specializatio:"+w.specialization);
			manager n=new manager();
			n.name="hisan";
			n.age=24;
			n.address="panikattil";
			n.salary=80000;
			n.printdetails();
			n.department="science";
			System.out.println("department:"+n.department);
		}
}
class Memberss
{
	String name;
	int age;
	String address;
	double salary;
    public void printdetails()
    {
    	System.out.println("name is:"+name);
    	System.out.println("age is:"+age);
    	System.out.println("address is:"+address);
    	System.out.println("salary is:"+salary);
    }
}
class worker extends Memberss
{
String specialization;
}
class manager extends Memberss
{
String department;
}

