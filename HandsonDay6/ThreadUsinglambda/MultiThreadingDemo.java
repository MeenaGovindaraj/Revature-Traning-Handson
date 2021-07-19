package threaddemo;

public class MultiThreadingDemo{
	
	public static void main(String[] args) {
		
		Thread.currentThread().setName("Main");
		System.out.println("Thread in main:"+Thread.currentThread().getName());
		
		Runnable r= () -> 
		{
			System.out.println("thread using lambda");
			System.out.println(Thread.currentThread());
			

			};
		Thread t1=new Thread(r);
		t1.start();
	}

	
	
}
