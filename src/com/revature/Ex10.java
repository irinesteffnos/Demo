package com.revature;

public class Ex10 {
	public int base;
	public int height;
	
	public Ex10(int pBase,int pHeight){
		this.base=pBase;
		this.height=pHeight;
		updateArea();

	}
	public void updateArea(){
	    double a=base*height/2;
	    System.out.println("Result:"+a);
	}
	public static void main(String... args) {
		new Ex10(4,6);
	}
}
