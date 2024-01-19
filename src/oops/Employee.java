package oops;
public class Employee {
	int salary;
	int deptno;
	String empname;
	String designation;
	public void display()
	{
		System.out.println(salary);
		System.out.println(deptno);
		System.out.println(empname);
		System.out.println(designation);
	}
	public static void main (String[]args){
		Employee emp=new Employee();
		emp.salary=70000;
		emp.deptno=2;
		emp.empname="anu";
		emp.designation="teacher";
		emp.display();
		
	}
}
