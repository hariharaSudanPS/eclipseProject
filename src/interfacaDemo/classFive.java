package interfacaDemo;

interface Batman{
	void gothamCity();
}

public class classFive {

	public static void main(String[] args) {
		Batman batman = ()->
		{
			System.out.println("I'm Batman!");
		};
		batman.gothamCity();
	}

}
