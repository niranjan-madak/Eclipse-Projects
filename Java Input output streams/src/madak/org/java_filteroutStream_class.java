package madak.org;

import java.io.*;

public class java_filteroutStream_class {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		FileOutputStream fis = new FileOutputStream(
				"C:\\Users\\madak\\eclipse-workspace\\Java Input output streams\\madak.txt");
		FilterOutputStream fos=new FilterOutputStream(fis);
		fos.write(92);
		System.out.println("data writen successfully!");
		fos.close();

	}

}
