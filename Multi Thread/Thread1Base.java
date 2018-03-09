class Thread1Base{
	public static void main(String[] args) {
		Thread1 ob = new Thread1();
		Thread1 ob2 = new Thread1();


		ob.start();
		ob2.start();
	}
}