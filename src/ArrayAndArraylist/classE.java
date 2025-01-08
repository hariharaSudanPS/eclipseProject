package ArrayAndArraylist;

import java.util.Scanner;

public class classE {
	public static void main(String[] args) {
		double [] scores;
		int Student;
		double lowest;
		double highest;
		double mean;
		
		System.out.println("How many students:");
		Scanner scanner = new Scanner(System.in);
		Student=scanner.nextInt();
		scores=new double [Student];
		System.out.println("please input Scores:");
		for(int i=0;i<scores.length;i++) {
			scores[i]=scanner.nextDouble();
			}
		lowest=Double.POSITIVE_INFINITY;
		for(double score:scores)
		{	
			if(score<lowest)
			lowest=score;
		}
		highest=Double.NEGATIVE_INFINITY;
		for(double score:scores )
		{
			if(score>highest)
			highest=score;
		}
		mean=0;
		for(double score:scores) {
			mean+=score;
		}
		mean/=Student;
		System.out.println("The scores were between "+lowest+" and "+highest+" with a mean of "+mean);
	}

}
