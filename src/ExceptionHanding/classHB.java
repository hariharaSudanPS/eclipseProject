package ExceptionHanding;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;
class readable{
	void readFile() {
		try {
			FileReader fr = new FileReader("SampleFile.txt");
			BufferedReader br = new BufferedReader(fr);
			String line = br.readLine();
			while(line!=null) {
			System.out.println(line);
			line=br.readLine();
			}
			}catch (IOException e) {
				System.out.println(e);
			}
	}
}
class writable{
	void writeFile() {
		try {
			FileWriter fw= new FileWriter("SampleFile.txt",true);
			Scanner scanner = new Scanner(System.in);
			System.out.println("Enter the text:");
			String word=scanner.nextLine();
			fw.append("\n");
			fw.append(word);
			fw.close();
			System.out.println("text added successfully");
		}
		catch (IOException e) {
			System.out.println(e);
		}
	}
}
public class classHB {
	public static void main(String[] args) {
		
		System.out.println("read or Write(1 to read ,2 to write)");
		Scanner sc = new Scanner(System.in);
		int choice = sc.nextInt();
		readable Readable =new readable();
		writable Writable = new writable();
		if(choice==1) {
			Readable.readFile();
			
		}
		else if(choice==2) {
			Writable.writeFile();
			
		}
		else {
			System.out.println("Something went wrong");
		}
	
	}

}
