import java.util.Scanner;

class Square extends Quad{
	private double side;

	public void setValue()
	{
		Scanner cin = new Scanner(System.in);

		System.out.println("Input the side of the Square");

		side = cin.nextDouble();
	}

	public double area()
	{
		return side*side;
	}

	public double perimeter()
	{
		return 4*side;
	}
}