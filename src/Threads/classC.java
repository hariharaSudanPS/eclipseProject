//create threads using Runnable
package Threads;
class subThread implements Runnable{
	public void run() 
	{
		System.out.println("hello there...");
	}
}
public class classC {
	public static void main(String[] args) {
		Runnable obj = new subThread();
		
		Thread t1 = new Thread(obj);
		t1.start();
	}
}
