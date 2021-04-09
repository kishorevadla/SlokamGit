package mar31;

import java.util.function.BiConsumer;

public class BiconsumerImpl  implements BiConsumer<Integer, String>{

	@Override
	public void accept(Integer t, String u) {
		System.out.println(t+u);
		
	}public static void main(String[] args) {
		
		BiConsumer bc = new BiconsumerImpl();
		
		bc.accept("123", "OneTwoThree");
		  BiConsumer<String, String> bca = (a,b) -> { 
			  System.out.println(a+b);
			  };bca.accept("159", "OneFiveNine");
		 
	}

}
