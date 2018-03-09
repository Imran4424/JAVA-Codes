class BMW extends Thread{

	public void run()
	{
		for(int i=0;i<100;i++)
		{
			for(int j=0;j<=i;j++);
			{
				System.out.print(" ");
			}

			System.out.println(">==>");
		}

		try{
			sleep(100);
		}
		catch(InterruptedException e)
		{
			e.printStackTrace();
		}
	}
}