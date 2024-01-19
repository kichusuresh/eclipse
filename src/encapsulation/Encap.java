package encapsulation;
 public class Encap 
{
    	public static void main (String[]args) 
    	{
    		encaps e=new encaps();
    		e.setName("krishna");
    		System.out.println(e.getName());
    	    e.setDesignation("tester");
    		System.out.println(e.getDesignation());
    		
    	}
}
class encaps
{
    private String name;
    private String designation;
   public String getName() 
 {
	return name;
  }
 public void setName(String name)
 {
 	this.name = name;
  }
 public String getDesignation()
 {
 	return designation;
 }
 public void setDesignation(String designation)
 {
 	this.designation = designation;
 }

} 

