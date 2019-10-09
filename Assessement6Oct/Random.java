import java.io.IOException;
import java.util.Date;
class Random extends Thread {
	
	@Override
	public void run() {
		
			for(int i=0;;){
			try {
				Thread.currentThread().sleep(1000);
			}
			catch(InterruptedException ie) {
				System.out.println(ie );
			}
			Date d=new Date();
			long time=d.getTime();
			//System.out.print(time%100000);
			System.out.print(((time%10000)/4)*3 - (time%100000)%3);			
			System.out.print("\r");
		}
			
		
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Random random=new Random();
		random.start();
	}

}