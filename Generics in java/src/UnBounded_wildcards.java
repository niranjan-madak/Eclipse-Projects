import java.util.*;
public class UnBounded_wildcards {
	public static void display(List<?> lists) {
		for(Object o:lists) {
			System.out.println(o);
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer> list1=Arrays.asList(1,2,3);
		List<String> list2=Arrays.asList("niranjan","kumar","madak");
		display(list1);
		display(list2);

	}

}
