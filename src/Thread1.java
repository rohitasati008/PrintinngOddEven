
public class Thread1 implements Runnable {

	Thread3 ob ;
	int count=1 ;
	public Thread1(Thread3 ob)
	{
		this.ob= ob ;
	}
	@Override
	public   void run() {
		// TODO Auto-generated method stub
		
		synchronized(ob)
		{
		while(ob.flag==1)
		{
			try {
				ob.wait();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
	 
		  printodd() ;
		  ob.flag = 1 ;
		  ob.notifyAll();
		}
		
   	}

 

	private    void printodd() {
		 
		System.out.println(count);
		count+=2 ;
	}

}
