import java.util.*;
class ReverseString{
	public static void main(String[] args) {
		String revString="";
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the string");
		String str= sc.nextLine();
		for(int i=str.length()-1;i>=0;i--)
		{
			revString=revString+str.charAt(i);
		}
		System.out.println(revString);
	}
}