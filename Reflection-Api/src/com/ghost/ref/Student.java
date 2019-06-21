package com.ghost.ref;

public final class Student {

	public String name;

	public int age = 19;

	private static  final  long mobileNo = 7057000300l;

	private Student(String name) {
		super();
		this.name = name;
	}

	private Student() {
		super();
	}

	public Student(int age) {
		super();
		this.age = age;
	}

	// method1
	public static void main(String[] args) {
		Student student = new Student("Ks");

	}

	// method 2
	private String askName(String first, String last) {
		return this.name = first+last;
	}
}
