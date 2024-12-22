package ExceptionHanding;
import java.util.Scanner;
class divisionExample{
	public void divideNumber(int numerator , int denominator) {
		try {
			int result=numerator/denominator;
			System.out.println("result:"+result);
		}
		catch(ArithmeticException e){
				System.out.println("Cannot divide by zero");	
		}

	}
}
public class classD {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		divisionExample Div = new divisionExample();
		System.out.println("enter the number:");
		int numerator= scanner.nextInt();
		int denominator=scanner.nextInt();
		Div.divideNumber(numerator,denominator);
	}

}
