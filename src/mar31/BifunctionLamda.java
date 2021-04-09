package mar31;

import java.util.function.BiFunction;

public class BifunctionLamda {
	public static void main(String[] args) {
		//BiFunction<Integer, Integer, Integer> fun = (a,b)->{
		BiFunction<Integer, String, String> fun = (a,b)->{
			return a+b;
		};System.out.println(fun.apply(15,"15"));	
	}

}
