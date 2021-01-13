package madak.org;

import java.io.*;

public class Java_BufferedInputStream {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		FileInputStream fis = new FileInputStream(
				"C:\\Users\\madak\\eclipse-workspace\\Java Input output streams\\madak.txt");
		BufferedInputStream bis=new BufferedInputStream(fis);
		int i=fis.available();
		byte arr[]=new byte[i];
		bis.read(arr);
		String str=new String(arr);
		System.out.println(str);
		bis.close();
		fis.close();
		

	}

}
