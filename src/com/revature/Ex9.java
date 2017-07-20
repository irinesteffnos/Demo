package com.revature;

public class Ex9 {
	static int radix = 2;  
	static int output = 0; 
	public int transformNumber(int n){
		
		output += radix*n; 
		radix = output/radix; 
		if(output<14){    
			return output;    
			}  
		else if(output>14){ 
			output = output*radix/2;   
			return output;   
			}  
		else {
			
			
			return output/2;   
			}
	
		}
	public static void main(String[] args) {
		Ex9 obj= new Ex9();
		obj.transformNumber(2);
		System.out.println("output:"+output);
	}
	}

