import java.io.*;
import java.util.*;
class CountCharLinesWords{
public static void main(String[] args) throws IOException {

File file=new File("file13.txt");
 
StringBuilder sb = new StringBuilder("");
 
BufferedReader br = new BufferedReader(new FileReader(file));
String str = "";
int len=0;
int noOfLine=0;
int noOfWords=0;
while((str = br.readLine()) != null)
{
    len=len+str.length();
    noOfLine=noOfLine+1;
    String[] Words=str.split(" ");
    for(int i=0;i<Words.length;i++)
    	noOfWords=noOfWords+1;
}
System.out.println("The number of Characters in the file is:"+len);
System.out.println("The number of Lines in the file is:"+noOfLine);
System.out.println("The number of Words in th file is:"+noOfWords);
br.close();
}
}