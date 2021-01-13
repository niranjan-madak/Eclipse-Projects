
public class Enums_with_switch {
	public enum Days{
		SUNDAY,MONDAY,TUESDAY,WEDNESDAY,THURSDAY,FRIDAY,SATURDAY;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		switch(Days.TUESDAY) {
		case MONDAY:
			
		System.out.println("it is monday today");	
		break;
		case SUNDAY:
			System.out.println("it is sunday today!");
			break;
		case TUESDAY:
			System.out.println("it is tuesday today");
		default:
			break;
		

	}

}}
