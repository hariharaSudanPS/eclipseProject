package ExceptionHanding;
import java.util.Scanner;
class NotValidException extends Exception{
	public NotValidException(String s){
		super(s);
		
	}
}
public class classC {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("voting validation (Age above 18)");
		System.out.print("enter your age:");
		try {
	        int age=sc.nextInt();
			if (age<18){
				throw new NotValidException("Age should be above 18");
			}
			else {
				System.out.println("eligible");
			}
		}catch(NotValidException e){
			System.out.println(e);
		}catch(Exception e) {
			System.out.println(e);
		}
		finally {
			System.out.println("Thank you");
		}
	}

}
