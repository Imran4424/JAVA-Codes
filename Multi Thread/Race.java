class Race{
	public static int count=0;

	public static void main(String[] args) {
		Thread Gallardo = new Thread(new Runnable(){
			public void run()
			{
				for(int i=0;i<20;i++)
				{
					for(int j=0;j<=count;j++)
					{
						System.out.print(" ");
					}
					count++;

					System.out.println(">##>");
				}

				/*
				try{
					sleep(100);
				}
				catch(InterruptedException e)
				{
					e.printStackTrace();
				} */
			}
		});

		Thread Carrera = new Thread(new Runnable(){
			public void run()
			{
				for(int i=0;i<20;i++)
				{
					for(int j=0;j<=count;j++)
					{
						System.out.print(" ");
					}
					count++;

					System.out.println(">==>");
				}

				
			}

		});

		Gallardo.start();
		Carrera.start();

		
	}
}