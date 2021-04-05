package test;                         //MultiThreading eg
interface Run1{
	public void run();
}
class ThreadEg implements Runnable{
@Override
	public void run() {
		// TODO Auto-generated method stub
		System.out.println("ThreadEg is Running --- 2");
	}
}
public class MultiThreadingLambdaEg {
   public static void main(String[] args) {
	ThreadEg threadeg = new ThreadEg();              //Normal way
	Thread thread = new Thread(threadeg);
	thread.start();
//	try {
//		thread.sleep(5000);
//	}
//	catch (InterruptedException e){
//		e.printStackTrace();
//	}
	System.out.println("ThreadLambdaEg is Running --- 1");
	
	Run1 run1 = () ->
		System.out.println("Run1 is running --- 3");
	run1.run();
	
	Runnable runnable = () -> {
	System.out.println("Runnable interface is running --- 5");
	};
	
	Thread thread1 = new Thread(runnable);
	thread1.start();
	System.out.println("Runnable interface -- start to run --- 4");
	
}
}
