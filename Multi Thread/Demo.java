class Demo{

	public static int count=0;		

	public static void main(String[] args) {
		Thread ob = new Thread (new Runnable(){
			public void run()
			{
				for(int i=0;i<1000;i++)
				{
					count++;
				}

				try{
					sleep(100);
				}
				catch(InterruptedException e)
				{
					e.printStackTrace();
				}
			}




		} );


		Thread ob2 = new Thread (new Runnable(){
			public void run()
			{
				for(int i=0;i<1000;i++)
				{
					count++;
				}

				try{
					sleep(100);
				}
				catch(InterruptedException e)
				{
					e.printStackTrace();
				}
			}
		});

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
		

		System.out.println("value "+ count);
	}
}