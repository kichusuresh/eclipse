package oops;
public class UsingConstuctor
{
	int empid;
	int salary;
	String desigination;
	public void setvalues(int empid,int salary,String desigination)
	{
		this.empid=empid;
		this.salary=salary;
		this.desigination=desigination;
		
		
	}
	 public void display()
	 {
		 System.out.println("empid="+empid);
		 System.out.println("salary="+salary);
		 System.out.println("desigination="+desigination);
	}
	 public static void main(String[] args)
	 
	 {
		UsingConstuctor usp=new UsingConstuctor();
		usp.setvalues(10,20000,"tester");
		usp.display();
		
		
	 }

	}

