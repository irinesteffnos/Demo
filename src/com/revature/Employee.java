package com.revature;


public class Employee {
int id;
String name;

public Employee(int id,String name)
{
	this.id=id;
	this.name=name;

}


@Override
public String toString() {
	return "Employee [id=" + id + ", name=" + name + "]";
}


public static void main(String[] args) {
	Employee[]emp=new Employee[5];
	emp[0]=new Employee(1,"irine");
	emp[1]=new Employee(2,"bhar");
	emp[2]=new Employee(3,"nith");
	emp[3]=new Employee(4,"nsj");
	emp[4]=new Employee(5,"angel");

	
	
	
	System.out.println(emp[0]);
	System.out.println(emp[1]);
	System.out.println(emp[2]);
	System.out.println(emp[3]);
	System.out.println(emp[4]);
}
}
