package mar31;

import java.util.function.Function;

public class FunctionImpl implements Function<Integer, String>{

	@Override
	public String apply(Integer t) {
		return t+"abc";
	}
	public static void main(String[] args) {
		Function fun = new FunctionImpl();
		
		System.out.println(fun.apply(20));
	}
	

}
