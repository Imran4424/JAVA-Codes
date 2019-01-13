import java.util.Scanner;

public class IntOutput  
{

	public static void main(String[] args) 
	{
		Scanner cin = new Scanner(System.in);
		
		int num;

		num = cin.nextInt();

		System.out.println("The entered number is: " + num);
	}
}