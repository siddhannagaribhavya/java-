import java.util.Scanner;
public class Evenoddsum {
	Scanner s = new Scanner(System.in);
	int size=s.nextInt();
	int a[]=new int[size];
	for(int i=0;i<size;i++) {
	System.out.println("enter the "+(i+1));
	a[i]=s.nextInt();
	}
	int evensum=0;
	int oddsum=0;
	for(int i=0;i<size;i++) {
		if(a[i]%2==0) {
		evensum=evensum+a[i];
	}
		else
		oddsum=oddsum+a[i];
	}
	System.out.println(evensum+"even sum");
	System.out.println(oddsum+"odd sum");
}

}



