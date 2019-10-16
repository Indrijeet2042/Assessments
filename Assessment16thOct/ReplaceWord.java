import java.io.*;
import java.util.*;
class ReplaceWord{
public static void main(String[] args) throws IOException {

File file=new File("file15.txt");
 
StringBuilder sb = new StringBuilder("");
 
BufferedReader br = new BufferedReader(new FileReader(file));
String str = "";
System.out.println("Enter the word you want to replace");
Scanner sc=new Scanner(System.in);
String str1=sc.nextLine();
System.out.println("Enter the word with which you want to replace:");
   String str2=sc.nextLine();

   int a=0;
   while((a=br.read())!=-1)
   {
   	sb.append((char)a);
   }
   br.close();
   str=new String(sb);
   str=str.replaceAll(str1,str2);

   FileWriter fw=new FileWriter(new File("file15.txt"));
   fw.write(str);
   fw.flush();
   fw.close();
System.out.println("The Words in the file has been replaced:");

}
}