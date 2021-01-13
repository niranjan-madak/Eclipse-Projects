import java.util.*;
public class ArrayDeque_in_java {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Deque<String> pq=new ArrayDeque<String>();
		pq.add("sachin sharma");
		pq.add("shweta garg");
		pq.add("bhupender");
		pq.add("sankalp");
		
		Iterator<String> itr=pq.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
		
		System.out.println("head element is:"+pq.element());
		System.out.println("head element is :"+pq.peek());
		
		System.out.println("after removing elements :"+pq.poll());


	}

}
