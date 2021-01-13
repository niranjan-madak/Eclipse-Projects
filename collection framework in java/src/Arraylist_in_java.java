import java.util.*;
public class Arraylist_in_java {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String> list=new ArrayList<String>();
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
