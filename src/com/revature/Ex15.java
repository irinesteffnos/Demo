package com.revature;

public class Ex15 {
	  static int someInt = 10;
	  public static void changeIt(int a){
	    a = 20;
	  }
	  public static void main(String[] args){
	    changeIt(someInt);
	    System.out.println(someInt);
	  }
}
