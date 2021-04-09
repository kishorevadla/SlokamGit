package com.slokam.java8;

public class multipara {

	public static void main(String[] args) {
		multiple mul=(a,b)->{
			return a+b;
		};System.out.println(mul.mult(10,20));
		multiple mult=(a,b)->{
			return a-b;
		};System.out.println(mult.mult(15, 10));
	multiple multi=(a,b)->{
		return a*b;
	};System.out.println(multi.mult(4, 5));
	multiple multip=(a,b)->{
		return a/b;
	};System.out.println(multip.mult(20, 5));
	multiple multipl=(a,b)->{
		return a%b;
	};System.out.println(multipl.mult(100, 15));
	}

}
