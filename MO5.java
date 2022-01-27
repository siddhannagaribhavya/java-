import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;
public class MO5 {


	public static void main(String[] args) throws IOException {
		try
		{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the sentence");
		String str=sc.nextLine();
		FileOutputStream n=new FileOutputStream("C:\\Intel\\output.text");
		for(int i=0;i<str.length();i++)
		{
			n.write(str.charAt(i));
		}
		catch(IOException e)
		{
			System.out.println("ioexception is handled")
		}
		}
		
		try
		{
		n.close();
		System.out.println("Successfully");
		}
		
		

	}


