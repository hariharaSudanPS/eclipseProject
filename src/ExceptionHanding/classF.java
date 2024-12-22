package ExceptionHanding;

class division{
	void div() throws Exception{
		 int a = 10/0;
		 System.out.println(a);
	}
}
public class classF {
	public static void main(String[] args) {
		division division=new division();
		
		try {
			division.div();
		} catch (Exception e) {
			System.out.println(e);
		}
		
	}

}
