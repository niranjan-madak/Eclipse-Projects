import java.util.*;
public class LinkedList_in_java {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedList<String> list=new LinkedList<String>();
		list.add("nirajan");
		list.add("niranjan");
		list.add("ravi");        //duplicates are allowed in list
		list.add("ravi");
		
		Iterator<String> itr=list.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}

	}

}
