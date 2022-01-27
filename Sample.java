import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

class Sample
	{
		Sample(String s)
		{
		}
		public void writeFile(String s) throws Exception
		{
			FileOutputStream f=new FileOutputStream("C:\\Intel\\output.text");
			ObjectOutputStream o=new ObjectOutputStream(f);
	        System.out.println();
			o.close();
		}
		public void readFile()throws Exception
		{
			FileInputStream f=new FileInputStream("C:\\Intel\\output.text");
			ObjectInputStream o1=new ObjectInputStream(f);
	        System.out.println(o1.readObject());
			
			o1.close();
		}
		
		
	}
	class Driver{
	
		public static void main(String[] args) throws Exception
		{
			Sample s=new Sample("Hello Good morning");
	       Thread t1=new Thread();
		   Thread t2=new Thread();

		    Sample) t1).readFile();
		   Thread.sleep(2000);
		   Sample) t2).writeFile("Write file is executing");
	        System.out.println(t1.getName());
			System.out.println(t2.getName());
		}

		private static Sample Sample(Thread t1) {
			// TODO Auto-generated method stub
			return null;
		}
	
	}

}
}
