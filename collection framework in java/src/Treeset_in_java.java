import java.util.*;
public class Treeset_in_java {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TreeSet<String> pq=new TreeSet<String>();
		pq.add("sachin sharma");
		pq.add("phweta garg");
		pq.add("bhupender");
		pq.add("sankalp");
		
		Iterator<String> itr=pq.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
		

	}

}
