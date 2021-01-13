package builtin_annotations;

class Bike{
	public  void run() {
		System.out.println("the bike is running safely!");
	}
}

class Car extends Bike{
	@Override
	public void run() {
		System.out.println("the car is running safely!");
	}
	
}

public class Override_annotaion  {


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Car c=new Car();
		c.run();
		

	}

}
