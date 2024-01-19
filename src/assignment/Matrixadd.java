package assignment;
import java.util.Scanner;
public class Matrixadd {
	public static void main(String[] args)
	{
		Scanner sc =new Scanner(System.in);
		int a[][]= {{1,2,3},{4,5,6},{7,8,9}};
		int b[][]= {{1,2,3},{4,5,6},{7,8,9}};
		int c[][]=new int[3][3];
		for(int i=0;i<3;i++)
		{
			for(int j=0;j<3;j++)
			{
				c[i][j]=a[i][j]+b[i][j];
			}
		}
		System.out.println("after addition");
		for(int m[]:c)
		{
			for(int v:m)
			{
				System.out.print(" "+v+"  ");
			}
			System.out.println();
		}

	}

}
