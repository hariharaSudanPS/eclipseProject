package ArrayAndArraylist;
import java.util.Iterator;
import java.util.Scanner;
public class classB {
public static void main(String[] args) {
	Scanner scan=new Scanner(System.in);
	int[]score= new int[5];
	System.out.println("Enter the Lab2 score:");
	for(int j=0;j<score.length;j++) {
		score[j]=scan.nextInt();
	}
	System.out.println("Lab2 Score:");
	for(int i =0;i<score.length;i++) {
		System.out.print(score[i]+" ");
	}
}
}
