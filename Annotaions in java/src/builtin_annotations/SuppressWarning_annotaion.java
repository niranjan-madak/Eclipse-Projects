package builtin_annotations;
import java.util.*;

public class SuppressWarning_annotaion {

	@SuppressWarnings("unchecked")
	public static void main(String[] args) {
		// TODO Auto-generated method stub
@SuppressWarnings("rawtypes")
List list=new ArrayList();
list.add(10);
list.add("niranjan");
list.add(23.33);
for(Object o:list) {
	System.out.println(o);
}
	}

}
