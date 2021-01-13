import java.util.*;
public class Stack_in_java {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Stack<String> stk=new Stack<String>();
		stk.push("Aayushi");
		stk.push("somiya");
		stk.push("rahul");
		stk.push("zahid");
	System.out.println(stk.pop());
		System.out.println(stk.peek());
		Iterator<String> itr=stk.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}

	}

}
