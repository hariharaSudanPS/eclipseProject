// using join()method,it will stop the main thread until the st.start() complete
package Threads;

class subTheread extends Thread
{
	int i =0;
	public void run() {
			for(int j=0;j<50;j++) {
				i=j;
			}
	}
}
public class classB {
	public static void main(String[] args) {
		subTheread st=new subTheread();
		st.start();
		try {
			st.join();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println(st.i);
	}

}
