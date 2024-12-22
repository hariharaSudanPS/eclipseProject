package ExceptionHanding;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class classGB {
public static void main(String[] args) {
	try {
		FileWriter fw=new FileWriter("SampleFile2.txt",true);
		BufferedWriter bw = new BufferedWriter(fw);
//		bw.write("Hello there...");
//		bw.newLine();
//		bw.write("use Buffered writer");
//		bw.close();
		bw.newLine();
		bw.append("i'm appending this text by using 'true' keyword");
		bw.close(); 
		System.out.println("success");
	} catch (IOException e) {
		System.out.println("Somwthing went wrong...");
	}
}
}
