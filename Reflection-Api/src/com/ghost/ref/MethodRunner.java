package com.ghost.ref;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;

public class MethodRunner {
	
	public static void main(String[] args) throws Exception {
		
		// 3rd is 
		Student student = new Student(20);
		Class stdClass = student.getClass();
		
		
		// this method will return all the public methods in the class or superclass or interface
		Method[] methods = stdClass.getMethods();
		System.out.println("no of public methods are -- >>   "+methods.length);
		
		
		// will get all declared members pivate public all type
		Method[] declaredMethods = stdClass.getDeclaredMethods();
		System.out.println("no of declared fields are ---- >   "+declaredMethods.length);
		
		
		for (Method method : declaredMethods) {
			System.out.println("-------------------");
			System.out.println("Mehtod name  ---- >  "+ method.getName());
			System.out.println("Mehtod return type  ---- >  "+ method.getReturnType());
			System.out.println("modifier type  ---- >  "+ Modifier.toString(method.getModifiers()));
			
			System.out.println("no of parameters  ---- >  "+ method.getParameterCount());
			System.out.print(" types of parameter --- > ");
			Class<?>[] parameterTypes = method.getParameterTypes();
			for (Class<?> class1 : parameterTypes) {
				System.out.print(class1.getName() + "   ");
			}
			System.out.println();
			
		}
		
		System.out.println("-------------------------------------");
		
		Method askMethod = declaredMethods[1];
		askMethod.setAccessible(true);
		System.out.println(askMethod.invoke("Kshitij", "JOshi"));
	
		
			
		
	}

}
