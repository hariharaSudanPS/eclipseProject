package interfacaDemo;

interface Playable{
	void play();
}

class Guiter implements Playable{
	public void play() {
		System.out.println("Bloody Sweet");
	}
}

class Piano implements Playable{
	 public void play() {
		 System.out.println("Benz");
	 }
	
}
public class classTwo {
	public static void main(String[] args) {
		Guiter song1 = new Guiter();
		song1.play();
		Piano song2 = new Piano();
		song2.play();
	}

}
