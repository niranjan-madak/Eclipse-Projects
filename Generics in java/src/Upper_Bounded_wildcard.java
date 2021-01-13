

import java.util.*;
public class Upper_Bounded_wildcard {
	public static double add(List<? extends Number> num) {
		double sum=0.0;
		for(Number n:num) {
			sum=sum+n.doubleValue();
		}
		return sum;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer> list1=new ArrayList<Integer>();
		list1.add(10);
		list1.add(20);
		
		List<Double> list2=new ArrayList<Double>();
		list2.add(30.0);
		list2.add(40.0);
		
		System.out.println("printing sum of integer values :"+add(list1));
		System.out.println("printing sum of double values :"+add(list2));

	}

}
