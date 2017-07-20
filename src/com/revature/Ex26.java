package com.revature;

public class Ex26 {
	public static void main(String args[]){
	      Person p1 = new Person("John" , 22);
	      Ex26 te = new Ex26();
	      Person p2 = te.change(p1);
	     System.out.println(p2.pid +" "+p2.name+ " "+p2.age);
	      System.out.print(p1.pid +" "+p1.name+" "+ p1.age);
	    }
	    private Person change(Object o){
	    Person p2 = (Person)o;
	    p2.age = 25;
	   return p2;
	    }
}
