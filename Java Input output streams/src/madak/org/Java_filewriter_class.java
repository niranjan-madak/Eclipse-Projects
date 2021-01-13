package madak.org;

import java.io.*;

public class Java_filewriter_class {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		FileWriter fw = new FileWriter("C:\\Users\\madak\\eclipse-workspace\\Java Input output streams\\madak.txt");
		
		fw.write("hello aayushi!");
		fw.close();
		System.out.println("content written successfully!");
	}

}
