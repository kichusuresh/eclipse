package abstraction;

public class Abstraction {

	public static void main(String[] args) {
			searchall a=new searchall();
			a.message();
			a.search();
			image i=new image();
			i.message();
			i.search();
			video v=new video();
			v.message();
			v.search();
		}
	}
	abstract class google
	{
		abstract void search();
		public void message()
		{
			System.out.println("thank u for using google");
		}
	}
	class searchall extends google
	{
		@Override
		void search() 
		{		
			System.out.println("searchall details");
		}	
	}
	class image extends google
	{
		@Override
		void search() 
		{
			System.out.println("search image");
		}	
	}
	class video extends google
	{
		@Override
		void search() 
		{	
			System.out.println("search video");
		}

	}

