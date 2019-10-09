import java.util.*;

class Ind extends Exception{
	public Ind(String str){

		System.out.println(str);
	}
}

class AgeValidation{
	public static void main(String[] args) {
		System.out.println("Enter the age:-");
		Scanner sc=new Scanner(System.in);
		int age=sc.nextInt();
		try{
			if(age>15)
				throw new Ind("Age is More than 15 years.");
			else
				throw new Ind("Age is 15 or less than 15 years");
		}
		catch(Ind ie){
			System.out.println(ie);
		}
		
	}
}