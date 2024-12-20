package ExceptionHanding;
import java.util.InputMismatchException;
import java.util.Scanner;

public class classA {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a=0;
		int b=0;
		int c=0;
		try{
			a = sc.nextInt();
			b = sc.nextInt();
			c = a/b;	
		}
		catch(InputMismatchException e) {
			System.out.println("InputMismatchException,please try again "+e);
		}
		catch(ArithmeticException e) {
		System.out.println("ArithmeticException,please try again "+e);
	
		}
		if(c!=0) {
			System.out.println("fianl result:"+c);
		}
	}

}
