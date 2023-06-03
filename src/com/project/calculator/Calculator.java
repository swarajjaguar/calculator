package com.project.calculator;

import java.util.Scanner;

public class Calculator {

	public void add(int a,int b) {
		System.out.println("the addition of two number is :"  + (a+b));
		
	}
	public void multi(int a,int b) {
		System.out.println("the multipliaction of two number is :"  + (a*b));
		
	}
	public void div(int a,int b) {
		System.out.println("the divission of two number is :"  + (a/b));
		
	}
	public static void main(String[] args) {
		Calculator cal=new Calculator();
		
		cal.add(10, 15);
		cal.multi(15, 6);
		cal.div(856, 10);
	}

}
