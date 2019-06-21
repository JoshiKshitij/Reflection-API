package com.ghost.ref;

import java.lang.reflect.Field;
import java.lang.reflect.Modifier;

public class FieldRunner {

	public static void main(String[] args) throws Exception {
		Class studentClass = Student.class;
		// new istance() uses public defalut contructor to crete object so it will thorw
		// an exception
		// Student student = (Student)studentClass.newInstance();

		Field[] fields = studentClass.getFields();
		System.out.println("public fields are --->   " + fields.length);

		Field[] declaredFields = studentClass.getDeclaredFields();
		System.out.println("all fields are --->   " + declaredFields.length);
		
		
		System.out.println();
		System.out.println("details of fileds or data members");
		for (Field field : declaredFields) {
			System.out.println("-------------------------");
			System.out.println("method name ---> " + field.getName());
			System.out.println("type of filed ---> " +field.getType());
			System.out.println("type of modiers -- > " +Modifier.toString(field.getModifiers()));
			System.out.println("is accessible ---> " +field.isAccessible());
			
			
		}
		
		
	}

}
