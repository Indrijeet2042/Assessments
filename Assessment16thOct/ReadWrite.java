import java.io.*;
import java.util.*;
class ReadWrite{
	public static void main(String[] args) throws IOException {
		File file=new File("file12.txt");
		StringBuilder sb=new StringBuilder(" ");
		BufferedReader br=new BufferedReader(new FileReader(file));
		String str=" ";
		int i=1;
		while((str=br.readLine())!=null)
		{
			System.out.print(i);
			sb.append(str);
			System.out.println("Constents of the file is:"+br.readLine());
			i++;
		}
		br.close();
		//System.out.println("Constents of the file is:"+sb);
	}
}