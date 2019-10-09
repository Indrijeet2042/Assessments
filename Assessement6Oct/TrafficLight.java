//Exercise 1:
import java.util.*;
class TrafficLight{
	public static void main(String[] args) {
		System.out.println("Enter your choices!");
		System.out.println("Enter 1 for RED!");
		System.out.println("Enter 2 for YELLOW!");
		System.out.println("Enter 3 for GREEN!");
		Scanner sc=new Scanner(System.in);
        int Number=sc.nextInt();
        switch(Number)
        {
        	case 1:
        	if(Number==1)
        		System.out.println("RED");
        	case 2:
        	if(Number==2)
        		System.out.println("YELLOW");
        	case 3:
        	if(Number==3)
        		System.out.println("GREEN");
        }
		
	}
}