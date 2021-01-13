package madak.org;
import java.util.*;

public class Generic_in_collection {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Integer> list=new ArrayList<Integer>();
		list.add(2);
		list.add(3);
		list.add(8);
		
		Iterator<Integer> itr=list.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}

	}

}
