package ExceptionHanding;
import java.util.Scanner;
class InvalidAgeException extends Exception{
	public InvalidAgeException(String message) {
		super(message);
	}
}
 class AgeValidation{
	 void checkAge(int age) {
		 try {
		 if(age<0||age>150) {
			 throw new InvalidAgeException("age invalid");
		 }else {System.out.println("Valid age");
		 }
		 }
		 catch(Exception e) {
			 System.out.println(e);
		 }
	 } 
 }

public class classE {
	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		AgeValidation ageValidation= new AgeValidation();
		int age=scanner.nextInt();
		ageValidation.checkAge(age);
		
	}

}
