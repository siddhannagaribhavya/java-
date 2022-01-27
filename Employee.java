import java.io.*;
import java.util.*;


public class Employee1
{
	public static <Employee> void main(String[] args) {
		FileOutputStream n=new FileOutputStream("C:\\Intel\\output.text");
	System.out.println("Successfully created the file");
	ObjectOutputStream o=new ObjectOutputStream(n);
	       
	
	Employee e=new Employee(12,"miller",10000);
System.out.println("Serialization is done");
owriteObject(e);