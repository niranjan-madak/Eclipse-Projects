package madak.org;

import java.util.*;

class Student1 {
	int rollno;
	int age;
	String name;

	Student1(int rollno, String name, int age) {
		this.name = name;
		this.age = age;
		this.rollno = rollno;
	}
}

class NameBasedComparator implements Comparator<Student1> {

	@Override
	public int compare(Student1 s1, Student1 s2) {
		// TODO Auto-generated method stub

		return s1.name.compareTo(s2.name);
	}

}

class AgeBasedComparator implements Comparator<Student1> {

	@Override
	public int compare(Student1 s1, Student1 s2) {
		// TODO Auto-generated method stub
		if (s1.age == s2.age) {
			return 0;
		} else if (s1.age > s2.age) {
			return 1;
		} else
			return -1;
	}

}

public class Comparator_Interface_implementation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Student1> list = new ArrayList<Student1>();
		list.add(new Student1(1, "mohit", 20));
		list.add(new Student1(2, "shweta", 22));
		list.add(new Student1(3, "aayushi", 23)); // case sensitive

		Collections.sort(list, new NameBasedComparator());
		for (Student1 st : list) {
			System.out.println(st.name + " " + st.rollno + " " + st.age);
		}

		System.out.println("***************");
		Collections.sort(list, new AgeBasedComparator());
		for (Student1 st : list) {
			System.out.println(st.age + " " + st.name + " " + st.rollno);
		}

	}

}
