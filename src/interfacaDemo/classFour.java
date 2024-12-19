package interfacaDemo;

interface Display{
	void display();
}
public class classFour {
	public static void main(String[] args) {
		
	
	Display disp = new Display() {
		public void display()
		{
			System.out.println("this is Display Method");
		}
	};
	disp.display();
	

}
} 