import java.util.*;
import java.io.*;

class Fibonacci{
	public static void main(String[] args) {
		InputOutput obj=new InputOutput();
	    int num1=obj.fun();
		Ind obj1=new Ind();
		System.out.println(obj1.fun1(num1));
		
	}
}
class InputOutput{
	int fun(){
		System.out.println("Enter the post of Fib number");
		Scanner sc=new Scanner(System.in);
		int num=sc.nextInt();
		return num;
	}
}
class Ind{
	int num;
	int fun1(int num){
		this.num=num;
		if(num==1)
			return num;
		return fun1(num-1)+fun1(num-2);
   }
}