package assignment;
public class Largestinarray {
	public static void main(String[] args) {
		int a[]= {17,8,24,13,7};
		int l=a[0];
		for(int i=0;i<a.length;i++)
		{
			if(a[i]>l)
			{
				l=a[i];
			}
		}
		System.out.println("largest="+l);

	}

}
