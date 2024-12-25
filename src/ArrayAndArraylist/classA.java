package ArrayAndArraylist;

public class classA {
public static void main(String[] args) {
	int [] examResult = new int[5];
	String [] subject = {"tamil","english","maths","science","social"};
	examResult[0]=54;
	examResult[1]=56;
	examResult[2]=60;
	examResult[3]=19;
	examResult[4]=70;
	for(int i=0;i<5;i++) 
	{
		System.out.println("Subject:"+subject[i]+"\tMark:"+examResult[i]);
    }
	
}
}
