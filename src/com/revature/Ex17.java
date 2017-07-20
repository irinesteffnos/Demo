package com.revature;

public class Ex17 {
	int a = 10;
	int b = 20;
  public static void main(String[] args) {
	new Ex17().print();
	}
  
  public void print(){
	  
	  pass(a);
  }
  
  
  public void pass(int a){
	  int c = b/a;
	  System.out.print(c);
  }
}
