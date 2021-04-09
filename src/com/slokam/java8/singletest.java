package com.slokam.java8;

public class singletest {

	public static void main(String[] args) {
		single si = (a) -> {
			int c = a+10;
			return c;
		};
		System.out.println(si.gag(10));

		single sin = a -> {
			return a * 10;
		};
		System.out.println(sin.gag(10));

		single sing = a -> {
			return a / 10;
		};
		System.out.println(sing.gag(10));
		single singl = a -> {
			return a % 5;
		};
		System.out.println(singl.gag(12));
	}

}
