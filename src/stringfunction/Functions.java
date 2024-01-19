package stringfunction;
public class Functions {
	public static void main(String[] args) {
		{
			
				//length of string
				String s="one direction";
				System.out.println(s.length());
				
				int l=s.length();
				System.out.println("length is :"+l);
				
				//join two strings
				String s1="harry";
				String s2="styles";
				System.out.println(s1.concat(s2));
				System.out.println(s1+s2);
				System.out.println(1+2+s2);
				System.out.println(s2+1+2);
				
				// change the case to upper and lower
				String L="HARRY STYLES";
				System.out.println(L.toLowerCase());
				String u="Harry STYLES";
				System.out.println(u.toUpperCase());
				
				//endswith and startswith
				//String L="HARRY STYLES";
				System.out.println(L.endsWith("S"));
				System.out.println(L.startsWith("S"));
				
				//compare two string
				String a="abc";
				String b="ABC";
				System.out.println(a.equals(b));
				System.out.println(a.equalsIgnoreCase(b));
				
				//trim - remove whitespace
				String d=" one way one band one direction ";
				System.out.println(d);
				System.out.println(d.trim());
				
				//substring-extract portion
				String f="onedirection";
				System.out.println(f.substring(3));
				System.out.println(f.substring(3,9));
				
				//contains word or char is present or not
				//String d=" one way one band one direction ";
				System.out.println(d.contains("Way"));
				System.out.println(d.contains("way"));
				
				//replace
				//String d=" one way one band one direction ";
				System.out.println(d.replace("one","1"));
				
				//to display a particular character
				//String f="onedirection";
				System.out.println(f.charAt(3));
				
				//split
				//String d=" one way one band one direction ";
				String len[]=d.split(" ");
				for(String y:len)
				{
					System.out.println(y);
				}
				
				String f1="onedirection";
				String le[]=f1.split("e");
				for(String x:len)
				{
					System.out.println(x);
				}
				
				//toCharArray
				//String f="onedirection";
				char lel[]=f.toCharArray();
				for(char w:lel)
				{
					System.out.println(w);
				}
			}
		}

	}


