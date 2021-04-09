package com.slokam.java8;

public class AbcTest  {

	public static void main(String[] args) {
		Abc ab = ()->{
			int a =30;
			int b=20;
			return a-b;
		};System.out.println(ab.calc());

		Abc abc=()->{
			int c=10;
			int d=20;
			return c*d;
		};System.out.println(abc.calc());
		
	}

}
