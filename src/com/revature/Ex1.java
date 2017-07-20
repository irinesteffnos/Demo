package com.revature;

public class Ex1 {
		    int intVal = 0;
	    String strVal = "default";
	    public Ex1(int k){
	        this.intVal = k; 
	    }
	 public static void main(String[] args) throws Exception {
	        Ex1 d1 = new Ex1(10);
	        d1.strVal = "D1";
	        Ex1 d2 = d1;
	        d2.intVal = 20;
	        System.out.println("d2 val = "+d2.strVal);
	    }
}
