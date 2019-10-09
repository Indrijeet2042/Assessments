package com.cg.eis.exception;
import java.util.*;

class EmployeeException extends Exception{
	public EmployeeException(String str){

		System.out.println(str);
	}
	
}
class SalaryValidation{
	public static void main(String[] args) {
		System.out.println("Enter the Salary:-");
		Scanner sc=new Scanner(System.in);
		int salary=sc.nextInt();
		try{
			if(salary>3000)
				throw new EmployeeException("The salary is more than 3000");
			else
				throw new EmployeeException("The salary is less than 3000");
		}
		catch(EmployeeException ie){
			System.out.println(ie);
		}
		
	}
}