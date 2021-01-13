import java.util.*;
public class LinkedHashSet_in_java {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedHashSet<String> pq=new LinkedHashSet<String>();
		pq.add("sachin sharma");
		pq.add("shweta garg");
		pq.add("bhupender");
		pq.add("sankalp");
		
		Iterator<String> itr=pq.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
		
	}

}
