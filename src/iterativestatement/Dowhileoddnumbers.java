package iterativestatement;
public class Dowhileoddnumbers {
	public static void main(String[] args) {
		int i=1;
		int odd =0;
		do
		{
			odd=i%2;
			if(odd!=0) 
			{
				System.out.println(i);
			}
			i++;
		}while(i<=10);
}
}
