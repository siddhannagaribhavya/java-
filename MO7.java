import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;

public class MO7 {
	public static void main(String[] args) throws IOException {
		try
		{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the text");
		String str=sc.nextLine();
		FileOutputStream n=new FileOutputStream("C:\\Intel\\output.text");
		for(int i=0;i<str.length();i++)
		{
			f.read(str.charAt(i));
		}
		f.close();
		}
	


