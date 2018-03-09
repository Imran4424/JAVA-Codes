import java.util.Scanner;

class Triangle extends Shape2D{
	private double base,height,second,third;

	public void setValue()
	{
		Scanner cin = new Scanner(System.in);

		System.out.println("Input Base and Height of a Triangle"); 
		base = cin.nextDouble();
		height = cin.nextDouble();

		System.out.println("Input Other Two sides of the Triangle");

		second = cin.nextDouble();
		third = cin.nextDouble();
	}

	public double area()
	{
		return 0.5*base*height;
	}

	public double perimeter()
	{
		return base+second+third;
	}
}