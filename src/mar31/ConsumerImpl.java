package mar31;

import java.util.function.Consumer;

import com.slokam.java8.string;

public class ConsumerImpl implements Consumer<String>{

	@Override
	public void accept(String t) {

	System.out.println(t);	
	}
	public static void main(String[] args) {
		Consumer c = new ConsumerImpl();
		c.accept("hello");
		Consumer<String> str =s ->{
			System.out.println(s);	
		};str.accept("slokam");
		
	}
	
	

}
