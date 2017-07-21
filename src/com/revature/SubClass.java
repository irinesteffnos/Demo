package com.revature;

public class SubClass {
	public static class Subclass extends SuperClass {
		Subclass(int age){
		super(age);
		}
		
		
		public static void main(String argd[]){
		Subclass s = new Subclass(24);
		s.getAge();
		}
}
}
