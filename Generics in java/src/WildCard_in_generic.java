
import java.util.*;

abstract class Shape{
	public abstract void draw();
}
class Rectangle extends Shape{

	@Override
	public void draw() {
		// TODO Auto-generated method stub
		System.out.println("drawing rectangle");
		
	}
	
}
class Circle extends Shape{

	@Override
	public void draw() {
		// TODO Auto-generated method stub
		System.out.println("drawing circle");
		
	}
	
}
public class WildCard_in_generic {
 public static void drawShapes(List<? extends Shape> lists) {
	 for(Shape s:lists) {
		 s.draw();
	 }
	 
 }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Rectangle> list1=new ArrayList<Rectangle>();
		list1.add(new Rectangle());
		List<Circle> list2=new ArrayList<Circle>();
		list2.add(new Circle());
		drawShapes(list1);
		drawShapes(list2);

	}

}
