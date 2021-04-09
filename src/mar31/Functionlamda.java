package mar31;

import java.util.function.Function;

public interface Functionlamda {
	
	public static void main(String[] args) {
		Function<Integer, Integer> fun = a->{
			return a+10;
		};
		System.out.println(fun.apply(25));
	}
	

}
