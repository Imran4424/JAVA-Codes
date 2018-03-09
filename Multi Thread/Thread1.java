class Thread1 extends Thread{
	public void run()
	{
		for(int i=0;i<10;i++)
		{
			System.out.println(Thread.currentThread().getId()+ " value " +i);
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