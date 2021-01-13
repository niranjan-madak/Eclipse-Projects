package madak.org;
import java.util.Scanner;

public class Assertion_implementation {

	public static void main(String[] args) {
			Scanner sc = new Scanner(System.in);
			System.out.println("enter your age ?");
			
			int age=sc.nextInt();
			assert age>=18:"Age is not valid";
		
		System.out.println(age);

	}

}
