import java.util.Scanner;

class Residential extends Client{
	private int fragile;

	public void setData()
	{
		Scanner cin = new Scanner(System.in);

		System.out.println("Input Name,Address,Phone number,no of floors sequencially");

		name = cin.nextLine();
		address = cin.nextLine();
		number = cin.nextLine();
		no = cin.nextInt();

		System.out.println("Input 1 if you have fragile items otherwise 0");

		fragile = cin.nextInt();

	}

	public void costCal()
	{
		if(no==1){
			base_cost = 206;
		}
		else if(no == 2 || no == 3){
			base_cost = 557;
		}
		else{
			base_cost = 1207;
		}

		if(fragile == 1){
			total_cost = base_cost+(no*206);
		}

	
	}

	public void display()
	{
		System.out.println("Name: " + name);
		System.out.println("Address: " + address);
		System.out.println("Phone Number: " + number);
		System.out.println("No. of floors: " + no);
		System.out.println("Base Cost: " + base_cost);
		System.out.println("Total Moving Cost: " + total_cost);
		if(fragile == 1){
			System.out.println("Yes, Fragiles are requested");
		}
	}
}