import java.util.*;

public class PrimeNum1{
	public static void main(String[] args) {
		CalCulate obj1=new CalCulate();
		obj1.CalPrime();		
	}
}
class Input1{
	int num,count;
	int TakeInput(){
		System.out.println("Enter a number to find the prime number in between");
		Scanner sc=new Scanner(System.in);
	    num=sc.nextInt();
		return num;
	}
}
class CalCulate{	
	void CalPrime(){
		Input1 obj=new Input1();
		obj.num=obj.TakeInput();
	if(obj.num==0 || obj.num==1)
		System.out.println("No prime number exists");
		for(int i=2;i<=obj.num;i++){
			obj.count=0;
			for(int j=2;j<=i;j++)
			{
				if(i%j==0)
					obj.count++;          	
			}
			if(obj.count==1)
				System.out.println(i);
		}
	}
}