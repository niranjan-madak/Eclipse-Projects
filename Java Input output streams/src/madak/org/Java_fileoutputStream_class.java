package madak.org;

import java.io.FileOutputStream;
import java.io.IOException;

public class Java_fileoutputStream_class {

	public static void main(String[] args) throws IOException {
		try (// TODO Auto-generated method stub
		FileOutputStream fos = new FileOutputStream(
				"C:\\Users\\madak\\eclipse-workspace\\Java Input output streams\\madak.txt")){

			
		
		
			fos.write(65);
			System.out.println();
			String str="niranjan";
		
			byte arr[]=str.getBytes();
			fos.write(arr);
			System.out.println("file written successfully");
		}
	}

}
