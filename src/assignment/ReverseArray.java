package assignment;
public class ReverseArray {
	public static void main(String[] args) 
	{
		int a[]= {17,8,24,13,7};
		int rev[]=new int[5];
		System.out.println("before reverse:17,8,24,13,7");
		System.out.print("after reverse:");
		for(int i=a.length-1;i>=0;i--)
		{
			rev[i]=a[i];
			System.out.print(rev[i]+" ");
		}	

	}

}
