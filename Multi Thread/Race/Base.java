class Base{

	public static void main(String[] args) {
		Gallardo ob = new Gallardo();
		BMW ob2 = new BMW();

		ob.start();
		ob2.start();

		try{
			ob.join();
			ob2.join();
		}
		catch(InterruptedException e)
		{
			e.printStackTrace();
		}
	}
}