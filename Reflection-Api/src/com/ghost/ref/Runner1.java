package com.ghost.ref;

public class Runner1 {

	public static void main(String[] args) throws ClassNotFoundException, InstantiationException, IllegalAccessException {
		Class<Student> forName = (Class<Student>) Class.forName("com.ghost.ref.Student");
		Student student = (Student)forName.newInstance();
		
		// this will thow and exceptipn as the contructor is private in Student class
		int age = student.age;
		System.out.println(age);
		
		
	}
}
