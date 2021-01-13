package madak.org;

import java.io.*;

public class Java_Buffered_outputStream {

	public static void main(String[] args) throws Exception {
		System.out.println("hi");
		// TODO Auto-generated method stub
		FileOutputStream fos = new FileOutputStream(
				"C:\\Users\\madak\\eclipse-workspace\\Java Input output streams\\madak.txt");
		BufferedOutputStream bos=new BufferedOutputStream(fos);
		String  str="hello everyone";
		byte arr[]=str.getBytes();
		bos.write(arr);
		bos.flush();
		bos.close();
		fos.close();
		System.out.println("data written successfully !");

	}

}
