package mar31;

import java.util.function.BiPredicate;

public class Bipredicateimp implements BiPredicate<Integer, Integer> {

	@Override
	public boolean test(Integer t, Integer u) {
		return t>u;
	}
	public static void main(String[] args) {
		
		BiPredicate bip = new Bipredicateimp();
		System.out.println(bip.test(10, 12));
		System.out.println(bip.test(80, 18));
		System.out.println(bip.test(15, 10));
	}
	

}
