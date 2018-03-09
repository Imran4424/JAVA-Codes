import java.util.Scanner;

class Rectangle extends Quad{
	private double length,width;

	public void setValue()
	{
		Scanner cin = new Scanner(System.in);

		System.out.println("Input your length and width of the Rectangle");

		length = cin.nextDouble();
		width = cin.nextDouble();
	}

	public double area()
	{
		return length*width;
	}

	public double perimeter()
	{
		return 2*(length+width);
	}
}