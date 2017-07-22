package com.revature;

public class TestDogs {
	public static void main(String args[]){
		Animals a = new Animals(); // Animal reference and object
		Animals b = new Dogs(); // Animal reference but Dog object
		a.move();// runs the method in Animal class
		b.move();//Runs the method in Dog class
		
		}
}
