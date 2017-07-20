package com.revature;

class Ex20{
    public int base;
    public int height;
    public double area = 0;
    
    public Ex20(int pBase, int pHeight){
        this.base = pBase; this.height = pHeight;
        updateArea();
    }
    public void updateArea(){
        double a = base*height/2;
        area = a;
        System.out.println("result:"+a);
    }
    public void setBase(int b){ base  = b; updateArea(); }
    public void setHeight(int h){ height  = h; updateArea(); }

     public static void main(String[] args) {
		new Ex20(2,4);
		
	}




}


	

