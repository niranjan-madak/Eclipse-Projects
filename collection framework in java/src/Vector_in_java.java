import java.util.*;
public class Vector_in_java {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Vector<String> list=new Vector<String>();
		list.add("nirajan");
		list.add("niranjan");
		list.add("ravi");        //duplicates are allowed in list and vector is synchronized
		list.add("ravi");
		
		Iterator<String> itr=list.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}

	}

}
