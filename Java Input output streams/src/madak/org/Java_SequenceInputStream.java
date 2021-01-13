package madak.org;

import java.io.*;

public class Java_SequenceInputStream {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		FileInputStream fis1 = new FileInputStream(
				"C:\\Users\\madak\\eclipse-workspace\\Java Input output streams\\madak.txt");
		FileInputStream fis2 = new FileInputStream(
				"C:\\Users\\madak\\eclipse-workspace\\Java Input output streams\\madak2.txt");
		SequenceInputStream sis=new SequenceInputStream(fis1, fis2);
	int j;
	while((j=sis.read())!=-1) {
		System.out.print((char)j);
	}
	sis.close();
	fis1.close();
	fis2.close();

	}

}
