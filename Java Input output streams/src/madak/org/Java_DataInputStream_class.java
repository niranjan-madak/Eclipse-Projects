package madak.org;

import java.io.*;

public class Java_DataInputStream_class {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		FileInputStream fis = new FileInputStream(
				"C:\\Users\\madak\\eclipse-workspace\\Java Input output streams\\madak.txt");
		DataInputStream dis=new DataInputStream(fis);
		int j;
		while((j=dis.read())!=-1) {
			System.out.print((char)j);
			dis.close();
			//fis.close();
			
		}

	}

}
