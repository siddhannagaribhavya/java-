import java.util.Scanner;
public class Uniquenumbers {
	public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("enter the size");
	int size=sc.nextInt();
	int a[]=new int[size];
	for(int i=0;i<size;i++)
	{
		System.out.println("enter the"+(i+1)+"elemen");
		a[i]=sc.nextInt();
	}
	  int sum=0;
	  for(int i=0;i<size;i++)
	  {
		  int found=0;
		  for(int j=i+1;j<size;j++)
		  {
			 if(a[i]==a[j]) {
				 found=1;
				 a[j]=0;
			 }
		  }
		  if(found==0) {
	sum+=a[i];
		  }
	  }
	  System.out.println(sum);
		  }
}
