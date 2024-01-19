package arrayy;
public class Stringsplit {
	public static void main(String[] args) {
		
		//question-1//
		String s="jmeter";
		String s1="performing testing tool";
		System.out.println(s.concat(s1));
		
		//question-2//
		String i="java language is platform independent";
		System.out.println(i.contains("language"));
		if(i.contains("language"))
		{
			System.out.println("pass");
		}
		
       //question-3//
		String s3="selenium webdriver is used for web application testing";
		 String[] words=s3.split(" ");
		 for(String x:words)
		 {
			 System.out.println(x);
			 if(x.contains("webapplication"))
			 {
				 break;
			 }
		}
		 
	}

}
