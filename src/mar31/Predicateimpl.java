package mar31;

import java.util.function.Predicate;

public class Predicateimpl implements Predicate<Integer>{

	@Override
	public boolean test(Integer t) {
		return t>10;
	}
	public static void main(String[] args) {
		Predicate pr = new Predicateimpl();
		System.out.println(pr.test(15));
		
		Predicate<Integer> i = a->a>15;
		System.out.println(i.test(10));
	}

}
