
public class Creating_and_using_generic_method_in_java {
	public static <T> void printArray(T[] arr) {
		for(T element:arr) {
			System.out.println(element);
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Integer [] array= {1,2,3,4,5};
		printArray(array);

	}

}
