package oops;
public class Empconstructordefault { //define class variable
	int Empid;
	int salary;
	String designation;
public Empconstructordefault() //create instance variable
{
      Empid=4;
      salary=70000;
      designation="tester";	
}
public static void main(String[]args) {
	Empconstructordefault ob=new Empconstructordefault();
	System.out.println(ob.Empid);
	System.out.println(ob.salary);
	System.out.println(ob.designation);
	
}
}
