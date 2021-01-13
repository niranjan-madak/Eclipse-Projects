package madak.org;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.DataInputStream;
public class Reading_Writing_into_file_using_trywithresources {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try(FileOutputStream fos=new FileOutputStream("C:\\Users\\madak\\eclipse-workspace\\Try WithResources\\madak.txt");
				
			InputStream input=new FileInputStream("C:\\Users\\madak\\eclipse-workspace\\Try WithResources\\madak.txt")	
				){
		String msg="hi welcome to Hcl ";
		byte bytearr[]=msg.getBytes();
		fos.write(bytearr);
		System.out.println("content has been written successfully!");
		System.out.println("***********************");
		int data=input.available();
		DataInputStream inst=new DataInputStream(input);
		byte bytearr2[]=new byte[data];
		
		inst.read(bytearr2);
		String str=new String(bytearr2);
		System.out.println(str);

	}
		catch(Exception e) {
		e.printStackTrace();	
		}

}}
