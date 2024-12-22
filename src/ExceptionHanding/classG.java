package ExceptionHanding;
import java.io.FileWriter;
import java.io.IOException;
public class classG {
public static void main(String[] args) {
	try {
		FileWriter fw = new FileWriter("SampleFile.txt");
		fw.write("Hello there...");
		fw.close();
		System.out.println("Success");
	} catch (IOException e) {
		System.out.println("Something has happend...");
	}
	}
}
