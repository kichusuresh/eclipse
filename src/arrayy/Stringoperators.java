package arrayy;
public class Stringoperators {
	public static void main(String[] args) {	 
		//// find the length of string ///
		
		String s="welcome";
		System.out.println(s.length());   
		int w=s.length();
		System.out.println("length is"+w);
		
		/// 2 string joining using method concat ///
		
		String s1="hello";
		String s2="world";
		System.out.println(s1.concat(s2)); 
		
		 //or//
		
		System.out.println(s1+s2);
		
		//// add numeric values to string ////
		
		System.out.println(1+2+s1); 
		System.out.println(s1+1+2);
	
		 ///// uppercase and lower case ////
		
		String s5="luminar123";
		System.out.println(s5.toUpperCase());
		System.out.println(s5.toLowerCase());
		
		///// or /////
		System.out.println(s5.endsWith("3"));
		System.out.println(s5.startsWith("3"));
		
		//// compare to strings ////
		String a="abc";
		String b="abc";
		System.out.println(a.equals(b));
		System.out.println(a.equalsIgnoreCase(b));
		
		/// trim ///
		String q ="hello";
		System.out.println(q.trim());
		
		// etract portion //
		String y="welcome";
		System.out.println(y.substring(3));
		
		//or//
		System.out.println(y.substring(0,4));
		
		
	//// words or char is present or not /////	
		
			String x="Welcome to Luminar";
			System.out.println(x.contains("luminar"));
			
	////// replace //////
			
			System.out.println(x.replace("el","xy"));
			
	////// to display a particular character //////
			
			String z="welcome";
			System.out.println(z.charAt(4));
			
	////// split //////
			
			String w1="welcome to luminar";
			String[] words=w1.split(" ");
			for(String l:words)
			{
				System.out.println(l);
			}
			
			
			///to char array/// split char//
			
			String t="hello";
			char[] c1=t.toCharArray();
			for(char v:c1)
			{
				System.out.println(v);
			}
			
			 
			
				

	}
}
			
			
			
			
			
			
			
	


