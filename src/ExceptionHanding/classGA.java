package ExceptionHanding;

import java.io.FileWriter;
import java.io.IOException;

public class classGA {
public static void main(String[] args) {
	try {
		FileWriter fw= new FileWriter("SampleFile.txt",true);
		fw.append("Welcome to java");
		fw.close();
		
	} catch (IOException e) {
		
		System.out.println("Something went wrong...");
	}
}
}
