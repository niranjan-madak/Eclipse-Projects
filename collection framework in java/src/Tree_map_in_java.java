import java.util.*;
public class Tree_map_in_java {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		TreeMap<Integer,String> tm=new TreeMap<Integer, String>();
		tm.put(1,"anita");
		tm.put(2,"mamata");
		tm.put(3,"muskan");
		for(Map.Entry m:tm.entrySet()) {
			System.out.println(m.getKey()+" "+m.getValue());
		}
	}

}
