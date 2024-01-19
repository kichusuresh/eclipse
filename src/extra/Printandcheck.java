package extra;
public class Printandcheck {
	public static void main(String[] args) {
		String s="selenium webdriver is used for webappliaction testing";
		String a[]=s.split(" ");
		for(String w:a)
		{
			System.out.println(w);
			if(w.contains("webappliaction"))
			{
				break;	
			}
		}
	  }	
	}


