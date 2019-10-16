import java.io.*;
class FileProperties{
	public static void main(String[] args) throws IOException {

		File file=new File("file14.txt");
		boolean present=file.exists();
		if(present==true)
			System.out.println("The file is present.");
		else
			System.out.println("The file is not present.");


		if(file.canRead())
			System.out.println("The file is Readable.");
		else
			System.out.println("the file is not Readable.");

		if(file.canWrite())
			System.out.println("The file is Writable");
		else
			System.out.println("The file is not Writable");

		String nameOfFile=file.getName();
		int ind=nameOfFile.lastIndexOf(".");
		String sss=nameOfFile.substring(ind+1,nameOfFile.length());
		System.out.println("The type of the file is:"+sss);
		 
StringBuilder sb = new StringBuilder("");
 
BufferedReader br = new BufferedReader(new FileReader(file));
String str = "";
int noOfCharacters=0;
while((str = br.readLine()) != null)
{
   noOfCharacters=noOfCharacters+str.length();
}
br.close();
// fr.close();
System.out.println("Size of File in Bytes:"+2*noOfCharacters);
  
}

	}