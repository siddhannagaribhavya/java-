import java.util.Scanner;
public class AddArray {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("enter the size");
		int a1size=s.nextInt();
		int a1[]=new int[a1size];
		for(int i=0;i<a1size;i++)
		{
		System.out.println("enter the"+(i+1)+"element value");
		a1[i]=s.nextInt();
		}
		System.out.println("enter the size");
		int bsize=s.nextInt();
		int b[]=new int[bsize];
		for(int i=0;i<bsize;i++)
		{
			System.out.println("enter the"+(i+1)+"element value");
			b[i]=s.nextInt();
		}
		int csize=a1size+bsize;
		int c[]=new int[csize];
		int j=0;
		for(int i=0;i<csize;i++)
		{
			if(i<a1size)
			{
			c[i]=a1[i];
		}
		else
			c[i]=b[j++];
		
	}
	for(int i=0;i<bsize;i++)
	{
		System.out.println(c[i]);
	}
}
}
	
		
		
		

