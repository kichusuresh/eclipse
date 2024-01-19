package assignment;
import java.util.Scanner;
public class primeorNot {
	public static void main(String[] args)
	{
				int flag=0;
				Scanner sc =new Scanner(System.in);
				System.out.println("enter a number neither 0 nor 1");
				int n=sc.nextInt();
				if(n==2)
				{
					System.out.println("prime number");
				}
				else
				{
					for(int i=2;i<n;i++)
					{
						if(n%i==0)
						{
							flag=1;
							break;
						}
					}
				}
				if(flag==0)
				{
					System.out.println("prime number");
				}
				else 
				{
					System.out.println("not a prime");
				}
			}
		}
	


