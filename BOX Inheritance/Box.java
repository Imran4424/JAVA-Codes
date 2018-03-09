
import java.util.Scanner;

class Box{
	private double height,width,length;


	public Box(){
		height = width = length = 0.0;
	}

	public Box(double height,double width,double length){ 
		this.height = height;
		this.width = width;
		this.length = length;
	}
	public void setValue(){
		Scanner cin = new Scanner(System.in);
		System.out.println("Input Box height,width and length seqencially");

		height = cin.nextDouble();
		width = cin.nextDouble();
		length = cin.nextDouble();
	}
	public double display(){
		return height*width*length;
	}

}