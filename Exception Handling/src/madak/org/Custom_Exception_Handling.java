package madak.org;

public class Custom_Exception_Handling {
	public static void validAge(int age) throws InvalidAgeException {
		if(age<18) {
			throw new InvalidAgeException();
		}
		else {
			System.out.println("congrats you r eligible");
		}
	}

	public static void main(String[] args) throws InvalidAgeException {
		// TODO Auto-generated method stub
		validAge(19);

	}

}
