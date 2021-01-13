import java.util.*;
public class HashMap_in_java {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashMap<Integer,String> hm=new HashMap<Integer, String>();
		hm.put(1,"niranjan");
		hm.put(2,"rahul");
		hm.put(3,"muskan");
		hm.put(3,"munna");
		
		Set s=hm.entrySet();
		Iterator itr=s.iterator();
		while(itr.hasNext()) {
			Map.Entry map=(Map.Entry)itr.next();
			System.out.println(map.getKey()+" "+map.getValue());
		}

	}

}
