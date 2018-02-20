
public class Thread2 implements Runnable {
Thread3 ob ;
int count = 2;
	
	public Thread2(Thread3 t) {
		// TODO Auto-generated constructor stub
		this.ob = t ;
	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
		synchronized(ob)
		{
		while(ob.flag==0)
		{
			try {
				ob.wait();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
	 
		  printeven() ;
		  ob.flag = 0 ;
		  ob.notifyAll();
		}
	}

	private void printeven() {
		// TODO Auto-generated method stub
		System.out.println(count);
		count+=2;
	}

}
