
 enum Seasons{      //outside class
	SUMMER,WINTER,AUTUMN,FALL;
}

public class Enum_implementation {
	public enum Days{
		SUNDAY,MONDAY,TUESDAY,WEDNESDAY,THURSDAY,FRIDAY,SATURDAY;   //inside class
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(Days.FRIDAY);
		System.out.println("***************");
		
		for(Seasons s:Seasons.values()) {
			System.out.println(s);
			
			
		}
		System.out.println(Seasons.valueOf("AUTUMN"));
		System.out.println(Seasons.valueOf("AUTUMN").ordinal());
		
		
	}}
