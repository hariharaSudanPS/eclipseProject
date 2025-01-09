package practice;
import java.util.Scanner;
public class caesar_cipher {
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the string to encrypt:");
		String message= sc.nextLine();
		System.out.println("enter the Shift value(positive):");
		int shift=sc.nextInt();
		if(shift>=0) {
		String encryptedmsg= encrypt(message, shift);
		System.out.println(encryptedmsg);
		}
		else {
			System.out.println("INVALID SHIFT I/P!");
		}
		

	}
	public static String encrypt(String message,int shift) {
	StringBuilder encryptedmsg= new StringBuilder();
	for(char c : message.toCharArray()) {
	if(Character.isLowerCase(c)) {
			 c = (char)((c-'a'+shift+26)%26+'a');
		 
		 encryptedmsg.append(c);
	}
	else if(Character.isUpperCase(c)) {
		c= (char)((c-'A'+shift+26)%26+'A');
		encryptedmsg.append(c);
	}else {
	encryptedmsg.append(c);
	}
	}
	return encryptedmsg.toString();
	}
}
