import javax.swing.plaf.synth.SynthColorChooserUI;

public class Thread3  {
  int flag = 0;
	public static void main(String[] args) {
		Thread3 t = new Thread3();
		Thread1 t1  = new  Thread1(t);
		Thread2 t2 = new Thread2(t);
		 /*Thread first = new Thread(t1);
		 Thread second = new Thread(t2);*/
		 
		 for(int i = 0 ;i< 5;i++)
		 {
			
			
			 
			 {
				 Thread odd = new Thread(t1);
			 
				 {
				odd.start();
			 
			 }
			 }
			 
			 {
				 
				 Thread even = new Thread(t2);
			 
				 {
				even.start();
				 
				 }
			 }
	}
	}
}
