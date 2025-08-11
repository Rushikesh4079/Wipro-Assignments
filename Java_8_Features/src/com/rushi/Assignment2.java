package com.rushi;


interface addnumber{
	
	int add1(int a,int b);
}
 
public class Assignment2 {
 
	public static void main(String[] args) {

	addnumber a1=(a,b)->a+b;
	System.out.println(a1.add1(8, 9));
	
	}
 
}