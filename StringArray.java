import java.util.Scanner;
public class StringArray {
	

		public static void main(String[] args) {
			Scanner s=new Scanner(System.in);
			System.out.println("enter the size");
			int size=s.nextInt();
			String a[]=new String[size];
			for(int i=0;i<size;i++)
			{
				

			System.out.println("enter the"+(i+1)+"element value");
			a[i]=s.toString();
		}
			for(int i=0;i<size;i++)
			{
				System.out.println(a[i]);
			}
		}
	

}
