package madak.org;

import java.io.*;

public class Java_fileReader_class {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		FileReader fr = new FileReader("C:\\Users\\madak\\eclipse-workspace\\Java Input output streams\\madak.txt");
		int j;
		while((j=fr.read())!=-1){
			System.out.print((char)j);
			
		}
		fr.close();
		

	}

}
