package ExceptionHanding;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class classH{
	public static void main(String[] args) throws IOException {
		try {
		FileReader fr = new FileReader("SampleReadFile.txt");
		int c=fr.read();
		while(c!=-1) {
			System.out.print((char)c);
			c=fr.read();
		}
	
		}catch(FileNotFoundException e){
			System.out.println(e);
		}
	}
}