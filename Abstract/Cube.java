import java.util.Scanner;

class Cube extends Shape3D{
	private double a;

	public void setValue()
	{
		Scanner cin = new Scanner(System.in);

		System.out.println("Input the side of the Cube");

		a = cin.nextDouble();
	}

	public double area()
	{
		return 6*a*a;
	}	
	public double volume()
	{
		return a*a*a;
	}
}