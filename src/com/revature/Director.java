package com.revature;

public class Director extends Manager {

	
	
	Employe e =new Employe();
	Manager m = (Manager)e;
	void director(){
		System.out.println("Director");
	}
	
	public static void main(String[] args) {
		Director d = new Director();
		d.director();
		System.out.println(d);
	}
}
