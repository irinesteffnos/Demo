package com.revature;

public class Ex3 {
	 private int myValue = 0;
	    
	    public void showOne(int myValue){
	        myValue = myValue;
	    }
	    
	    public void showTwo(int myValue){
	        this.myValue = myValue;
	    }    
	    public static void main(String[] args) {
	        Ex3 ct = new Ex3();
	        ct.showOne(200);
	        System.out.println(ct.myValue);
	        ct.showTwo(100);
	        System.out.println(ct.myValue);
	    }
}
