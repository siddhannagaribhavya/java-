
 import java.io.*;
	import java.util.Scanner;
	public class MO6 {

		public static void main(String[] args) {
	   Scanner sc= new Scanner(System.in);
	   System.out.print("Enter the Sentence");
	   String str=sc.nextLine();
	   FileOutputStream n=null;
	   try {
		   n=new FileOutputStream("C:\\Intel\\output.text");
		   System.out.print("file is successfully created");
	   }
	   catch(FileNotFoundException  f)
	   {
		   System.out.print("The specified path is not available or operating sys is not given");
		   
	   }
	   for(int i=0;i<str.length();i++)
	{
		   try
		   {
			   n.write(str.charAt(i));
		   }
		   catch(IOException e)
		   {
			   System.out.print("IoExecuption is handled");
		   }
	}
	   try {
		   n.close();
		   System.out.print("file is unsuccessfully clossed");
	   }
	   catch(IOException e)
	   {
		   System.out.print("IoExecuption is handled");
	   }


}
}
