package abstraction;
public class StaticFinal {
	public static void main(String[] args) {
		System.out.println(schooldetails.department);
		System.out.println(schooldetails.department="Malayalam");
		System.out.println(schooldetails.department);
		//System.out.println(schooldetails.);
		schooldetails s=new schooldetails();
		System.out.println(s.schoolname);
		//System.out.println(s.schoolname="sahrdaya");
	}
}
class schooldetails
{
	final String schoolname="luminar";
	static String department="english";
	}


