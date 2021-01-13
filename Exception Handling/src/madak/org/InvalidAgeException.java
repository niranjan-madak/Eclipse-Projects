package madak.org;

public class InvalidAgeException extends Exception {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	InvalidAgeException(){       
		//super("Age is not valid");  //constuctor overriding is performed here.. both works
		//System.out.println("invalid age");
	}

}
