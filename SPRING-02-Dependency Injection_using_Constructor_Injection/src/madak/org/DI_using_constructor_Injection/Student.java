package madak.org.DI_using_constructor_Injection;

public class Student {
	
	private String name;
	private int rollno;
	public Student(int rollno) {
		
		this.rollno = rollno;
	}
	public Student(String name) {
		
		this.name = name;
	}
	public Student(String name, int rollno) {
		
		this.name = name;
		this.rollno = rollno;
	}
	public void displayInfo() {
		System.out.println("The new student details is:"+rollno+" "+name);
	}
	

}
