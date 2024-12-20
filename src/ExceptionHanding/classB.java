package ExceptionHanding;
import java.util.Scanner;
public class classB {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a;
		int b;
		int c;
		int err=0;
		try {
			a = sc.nextInt();
			b= sc.nextInt();
			c=a/b;
			err=0;
		}
		catch(Exception e) {
			
			err=1;
		}
		finally {
			if(err==0) {
				System.out.println("No Error");
			}
			else {
				System.out.println("Error");
			}
		}
		
	}
}
