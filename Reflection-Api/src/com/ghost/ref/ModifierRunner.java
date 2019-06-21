package com.ghost.ref;

import java.lang.reflect.Modifier;

public   class ModifierRunner {
	
	public static void main(String[] args) throws Exception {
		//1st way to get class object
		Class<Student> studentClass = (Class<Student>) Class.forName("com.ghost.ref.Student");
		
		//
		int modifiers = studentClass.getModifiers();
		System.out.println("Modifier ---->>  " +  Modifier.toString(modifiers));
		
		
		
		
	}

}
