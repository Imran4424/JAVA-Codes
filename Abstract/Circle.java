import java.util.Scanner;

class Circle extends Shape2D{
	private double PI = 3.1416,r;

	public void setValue()
	{
		Scanner cin = new Scanner(System.in);

		System.out.println("Input the radius of the Circle");

		r = cin.nextDouble();
	}

	public double area()
	{
		return PI*r*r;
	}

	public double perimeter()
	{
		return 2*PI*r;
	}
}