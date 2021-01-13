package madak.org;

interface Shape {
	public void drawShape();
}

public class Functional_interface_implementation_without_LambdaExpression {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Shape s = new Shape() { // using annonymos inner class

			@Override
			public void drawShape() {
				// TODO Auto-generated method stub
				System.out.println("drawing circle");

			}
		};
		s.drawShape();

	}

}
