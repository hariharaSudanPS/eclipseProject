package interfacaDemo;

interface Readable{
	void read(int a);
}

interface Writable{
	void write();
}

interface Storable{
	void store();
}

class file implements Readable,Writable,Storable{
	@Override
	public void read(int num) {
		System.out.println("reading...");
		System.out.println(num);
	}
	@Override
	public void write() {
		System.out.println("writing...");
	}
	@Override
	public void store() {
		System.out.println("storing...");
		
	}
}
public class classThree {

	public static void main(String[] args) {
		file File = new file();
		File.read(10);
		File.write();
		File.store();

	}

}
