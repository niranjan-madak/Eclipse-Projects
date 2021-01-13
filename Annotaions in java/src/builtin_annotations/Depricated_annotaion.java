package builtin_annotations;

class Hello{
	public void hello() {
		System.out.println("someone is saying hello");
	}
	@Deprecated
	public void bolo() {  //the horizontal cross says that the method is deprecated.
		System.out.println("the listener is asking to say!");
	}
}

public class Depricated_annotaion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Hello obj=new Hello();
		obj.bolo();

	}

}
