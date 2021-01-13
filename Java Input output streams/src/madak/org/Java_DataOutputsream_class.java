package madak.org;

import java.io.*;

public class Java_DataOutputsream_class {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		FileOutputStream fis = new FileOutputStream(
				"C:\\Users\\madak\\eclipse-workspace\\Java Input output streams\\madak.txt");
		DataOutputStream dos=new DataOutputStream(fis);
		dos.write(65);
		dos.close();
		fis.close();
		System.out.println("dat written successfully!");

	}

}
