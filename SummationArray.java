import java.util.Scanner;
public class SummationArray {

	public static void main(String[] args) {
	Scanner s=new Scanner(System.in);
	System.out.println("enter the size");
	int size=s.nextInt();
	int a[]=new int[size];
	for(int i=0;i<size;i++) {
	System.out.println("enter the "+(i+1));
	a[i]=s.nextInt();
	}
	int sum=0;
	for(int i=0;i<size;i++) {
		sum=sum+a[i];
		System.out.println(sum);
	
	
	}
	}

}
