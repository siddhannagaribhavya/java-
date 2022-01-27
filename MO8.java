import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;
public class MO8 {
	public static void main(String[] args) throws IOException {
		FileInputStream n=new FileInputStream("C:\\Intel\\output.text");
		System.out.println((char)n.read());//h
		System.out.println((char)n.read());//o
	    System.out.println((char)n.read());//l
        System.out.println((char)n.read());//l
        System.out.println((char)n.read());//o
      
     
         
    n.close();
    System.out.println();
    System.out.println("done");

	}

}
