import java.util.*;
public class NavigableMap_in_java {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		NavigableMap<Integer,String> tm=new TreeMap<Integer, String>();
		tm.put(1,"anita");
		tm.put(2,"mamata");
		tm.put(3,"muskan");
	System.out.println(tm.descendingMap());
	System.out.println(tm.headMap(3));
	System.out.println(tm.tailMap(2));
	System.out.println(tm.subMap(1,false,3,true));

	}

}
