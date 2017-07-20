package com.revature;


public class Ex13 {

int id;
String name;
public Ex13(int id, String name) {
	super();
	this.id = id;
	this.name = name;
	
}


@Override
public String toString() {
	return "Sample24 [id=" + id + ", name=" + name + "]";
}


public static void main(String[] args) {
	Ex13 []sam = new Ex13[5];
    sam[0] = new Ex13(1,"irine");
    sam[1] = new Ex13(2,"bhargavi");
    sam[2] = new Ex13(3,"nithya");
    sam[3] = new Ex13(4,"kani");
    sam[4] = new Ex13(5,"angel");
    

    System.out.println(sam[0]);
    System.out.println(sam[1]);
    System.out.println(sam[2]);
    System.out.println(sam[3]);
    System.out.println(sam[4]);

}

}

