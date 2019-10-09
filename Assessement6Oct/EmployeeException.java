package com.cg.eis.exception;

class EmployeeException extends exception{
	public Ind(int salary){

		System.out.println(salary);
	}
	
}
class SalaryValidation{
	public static void main(String[] args) {
		System.out.println("Enter the Salary:-");
		Scanner sc=new Scanner(System.in);
		int salary=sc.nextLine();
		try{
			if(salary>3000)
				throw new Ind("The salary is more than 3000");
			else
				throw new Ind("The salary is less than 3000");
		}
		catch(Ind ie){
			System.out.println(ie);
		}
		
	}
}