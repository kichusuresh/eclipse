package iterativestatement;

public class Whileoddnumbers {

	public static void main(String[] args) {
	int i =1;
	int odd;
	while(i<=10)
	{
		odd=i%2;
		if(odd!=0) {
			System.out.println(i);
		}
		i++;
	}

	}

}
