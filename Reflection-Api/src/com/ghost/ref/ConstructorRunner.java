package com.ghost.ref;

import java.lang.reflect.Constructor;
import java.lang.reflect.Modifier;

public  class ConstructorRunner{

	public static void main(String[] args) throws NoSuchMethodException, Exception {

		// 2nd way is
		Class classStudent = Student.class;

		System.out.println(" Super class name  --->>   " + classStudent.getSuperclass());

		// this method will return a array of public construtor
		Constructor[] constructors = classStudent.getConstructors();
		System.out.println("array size is -- >   " + constructors.length);

		// will give all conrtructors
		Constructor[] declaredConstructors = classStudent.getDeclaredConstructors();
		System.out.println("all construtors are ---- >    " + declaredConstructors.length);

		for (Constructor constructor : declaredConstructors) {
			System.out.println("---------------------");
			System.out.println("name of constructor -- >  " + constructor.getName());
			System.out.println("no of parameter passed -- >  " + constructor.getParameterCount());
			System.out.print("parameter passed -- >  ");

			Class[] parameterTypes = constructor.getParameterTypes();
			for (Class para : parameterTypes) {
				System.out.print(para.getName() + "   ");
			}
			System.out.println();
			System.out.println("list of modifiers -- >  " + Modifier.toString(constructor.getModifiers()));

		}

		Constructor constructor1 = classStudent.getConstructor(int.class);
		Student newInstance = (Student)constructor1.newInstance(23);
		System.out.println(newInstance.age);
		
		// this will not work if construtor is private
		//Constructor constructor2 = classStudent.getConstructor();
		//Student newInstance2 = (Student)constructor2.newInstance();
	//	System.out.println(newInstance2.age);
		
		Constructor<Student> constructor3  = classStudent.getDeclaredConstructor();
		constructor3.setAccessible(true);
		System.out.println(((Student)
				constructor3.
				newInstance()).
				age);
	}

	
}
