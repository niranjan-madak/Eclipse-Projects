import java.util.*;
public class Lower_Bounded_wildcards {
	public static void displayNum(List<? super Integer> lists) {
		for(Object o:lists) {
			System.out.println(o);
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
List<Integer> list1=Arrays.asList(1,2,3,4,5);
List<Number> list2=Arrays.asList(10.2,90.2,87,9);
displayNum(list1);
displayNum(list2);
	}

}
