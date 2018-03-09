abstract class Client{
	public String name,address,number;
	public int no;
	public double base_cost;
	public double total_cost;

	public abstract void setData();
	public abstract void costCal();
	public abstract void display();
}