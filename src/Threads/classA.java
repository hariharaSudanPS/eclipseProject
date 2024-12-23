package Threads;
class Main extends Thread{
 public void run() {
	 for(int i = 0;i<10;i++) {
	 System.out.println("hello there..");
	 try {
			Thread.sleep(10);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
 }
}
class Main2 extends Thread{
	public void run() {
		for(int i=0;i<10;i++) {
		System.out.println("bye...");
		try {
			Thread.sleep(20);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	}
}
public class classA {
public static void main(String[] args) {
	Main main = new Main();
	Main2 main2 = new Main2();
	main.start();
	main2.start();
	}
}

