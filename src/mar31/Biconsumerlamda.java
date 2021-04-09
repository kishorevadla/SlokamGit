package mar31;

import java.util.function.BiConsumer;

public class Biconsumerlamda {
	
public static void main(String[] args) {
	
	BiConsumer<String, String> str = (a,b)->{
		
		System.out.println(a+b);
		
	};str.accept("kishore", "nagarjun");
}
}
