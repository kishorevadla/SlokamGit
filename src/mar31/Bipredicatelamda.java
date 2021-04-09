package mar31;

import java.util.function.BiPredicate;

public class Bipredicatelamda {

	public static void main(String[] args) {
		BiPredicate<Integer, Integer> bip = (a,b)->{
			return a<b;
		};
		System.out.println(bip.test(15, 10));
	}
	
	
	
}
