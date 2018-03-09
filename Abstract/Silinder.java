import java.util.Scanner;

class Silinder extends Shape3D{
	private double PI = 3.1416,radius,height,length;

	public void setValue()
	{
		Scanner cin = new Scanner(System.in);

		System.out.println("Input your radius,height and length of The Silinder");

		radius = cin.nextDouble();
		height = cin.nextDouble();
		length = cin.nextDouble();
	}

	public double area()
	{
		return 2*PI*(radius+length);
	}
	public double volume()
	{
		return PI*radius*radius*height;
	}
}