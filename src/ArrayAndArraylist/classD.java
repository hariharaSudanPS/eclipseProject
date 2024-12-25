package ArrayAndArraylist;
import java.util.Scanner;
public class classD {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int[]Score=new int[10];
		int sum =0;
		System.out.print("enter the score:");
		for(int i=0;i<Score.length;i++) {
		 Score[i]=scanner.nextInt();
	}
		for(int i=0;i<Score.length;i++) {
			 sum+=Score[i]; 
		}
		System.out.println("sum:"+sum);
		System.out.println("Avg:"+sum/Score.length);
	}
}
