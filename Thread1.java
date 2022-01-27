
public class Thread1{

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		String name=Thread.currentThread().getName();
		System.out.println("ThreadName"+name);
		System.out.println(Thread.currentThread().getId());
		System.out.println(Thread.currentThread().getPriority());
		System.out.println(Thread.currentThread().getState());
		System.out.println(Thread.currentThread().isDaemon());
		for(int i=0;i<5;i++)
			System.out.println(i);
		    Thread.sleep(5000);
		    System.out.println(i);
		}
	
	
	

	}



