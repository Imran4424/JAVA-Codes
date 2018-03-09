import java.util.Scanner;

class Commercial extends Client{
	private double [] itemlist = new double[999];
	private int items,industrial=0,i;

	public void setData()
	{
		Scanner cin = new Scanner(System.in);

		System.out.println("Input Name,Address,Phone number,no of floors sequencially");

		name = cin.nextLine();
		address = cin.nextLine();
		number = cin.nextLine();
		no = cin.nextInt();

		System.out.println("Input the number of items not exceedeed 999");

		items = cin.nextInt();



		System.out.println("Input item weight in tons");

		for(i=0;i<items;i++){
			itemlist[i] = cin.nextDouble();

			if(itemlist[i]>2.06){
				industrial++;
			}
		}
	}

	public void costCal()
	{
		base_cost = no*1206;

		if(industrial == 1){
			total_cost = base_cost + (industrial*306);
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
		if(industrial == 1){
			System.out.println("Number of Items considered Industrial: " + industrial);
		}
	}
}