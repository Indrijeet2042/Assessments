import java.util.*;
class Palindrom4102019{
public static void main(String[] args) {
	String b="";
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter the string");
	String str= sc.nextLine();
	int len=str.length();
	for(int i = len - 1; i >= 0; i--)
            b = b + str.charAt(i);
        if(str.equalsIgnoreCase(b))
            System.out.println("It's a Palindrom");
        else
            System.out.println("Not a Palindrom");
    }
}
