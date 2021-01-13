class MyGenerics<T>{
	T a;
	public void add(T a) {
		this.a=a;
	}
	T get() {
		return a;
	}
}
public class Creating_and_using_Generic_classes {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MyGenerics<Integer> obj=new MyGenerics<Integer>();
		obj.add(10);
		System.out.println(obj.get());

	}

}
