package madak.org;

import java.io.FileInputStream;
import java.io.IOException;

public class Java_fileInputstream_class {

	public static void main(String[] args) throws IOException {
		try (// TODO Auto-generated method stub
		FileInputStream fis = new FileInputStream(
				"C:\\Users\\madak\\eclipse-workspace\\Java Input output streams\\madak.txt")) {
			int i=fis.read(); //for reading single character
			System.out.println((char)i);
			
			//for reading multiple characters
			int j=fis.available();
			byte arr[]=new byte[j];
			fis.read(arr);
			String str=new String(arr);
			System.out.println(str);
		}

	}

}
