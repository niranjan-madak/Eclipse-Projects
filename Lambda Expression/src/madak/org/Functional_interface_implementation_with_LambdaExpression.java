package madak.org;

interface Shape1 {
	public void drawShape();
}

public class Functional_interface_implementation_with_LambdaExpression {

	public static void main(String[] args) {

		// TODO Auto-generated method stub
		Shape1 s = () -> {
			System.out.println("drawing circle");
		}; // with no arguments in lambda expression
		s.drawShape();

	}

}
