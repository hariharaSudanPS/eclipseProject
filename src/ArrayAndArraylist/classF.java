package ArrayAndArraylist;

public class classF {
public static void main(String[] args) {
	int [] input= {1,2,3,4,5,6,7,8,9};
	int[] output= new int[input.length];
	for(int i=0;i<output.length;i++) {
		output[output.length-i-1]=input[i];
//		System.out.println(output.length-i-1+"="+input[i]);
	}
	for(int o : output) {
		System.out.print(o+" ");
	}
	System.out.println();
		
}
}