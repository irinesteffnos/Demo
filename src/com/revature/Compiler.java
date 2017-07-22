package com.revature;

import java.io.IOException;

public class Compiler {
void read(int No) throws IOException{
	System.out.println("reading no");
}
void write(int no) throws RuntimeException{
	System.out.println("writing no");
}
public static void main(String[] args) throws IOException {
	int no = 14;
	Compiler c = new Compiler();
	c.read(no);
	c.write(no);
}
}
 