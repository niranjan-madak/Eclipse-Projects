package madak.org;

import java.util.*;

class Student implements Comparable<Student> {
	int rollno;
	String name;
	int age;

	Student(int rollno, String name, int age) {
		this.age = age;
		this.name = name;
		this.rollno = rollno;
	}

	@Override
	public int compareTo(Student st) {
		// TODO Auto-generated method stub //sorting and comparison has been done on the
		// basis of age
		if (age == st.age) {
			return 0;
		} else if (age > st.age) {
			return 1;
		} else
			return -1;
	}

}

public class Comparable_interface_implementation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Student> list = new ArrayList<Student>();
		list.add(new Student(28, "niranjan", 25));
		list.add(new Student(29, "rahul", 24));
		list.add(new Student(23, "rohit", 21));

		Collections.sort(list);
		for (Student st : list) {
			System.out.println(st.rollno + " " + st.name + " " + st.age);
		}

	}

}
