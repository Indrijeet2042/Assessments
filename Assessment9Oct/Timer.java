import java.util.*;
import java.io.*;
class Timer extends Thread{
	public static void main(String[] args) throws InterruptedException {
		Timer t=new Timer();
		t.start();
		int i=1;
		while(i>0){
           System.out.print(i);
           System.out.print('\r');
		   t.sleep(1000);
		   i++;
	}
		
	}
}

