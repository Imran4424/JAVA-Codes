import java.util.*;

class Sum{
	public static void main(String args[]){
		Scanner cin = new Scanner(System.in);
		
		
		int x,y;
		
		System.out.println("Input X and Y");
		
		x = cin.nextInt();
		y = cin.nextInt();
		
		System.out.println("addition: " + (x+y));
		System.out.println("Substraction: " + (x-y));
		System.out.println("Multipication: " + (x*y));
		
		if(y!=0){
			System.out.println("Division: " + (x/y));
		}
		else{
			System.out.println("Error");
		}
		
	}

}