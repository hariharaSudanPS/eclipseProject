package ExceptionHanding;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class classHA {
	public static void main(String[] args) throws IOException {
		try {
			FileReader fr = new FileReader("SampleReadFile.txt");
			BufferedReader br = new BufferedReader(fr);
			String line = br.readLine();
			while(line!=null) {
			System.out.println(line);
			line = br.readLine();
			}
			br.close();
			} catch (FileNotFoundException e) {
			System.out.println(e);
		}
	}

}
