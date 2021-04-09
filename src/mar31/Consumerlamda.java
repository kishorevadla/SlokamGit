package mar31;

import java.util.function.Consumer;

public class Consumerlamda {
	
public static void main(String[] args) {
	Consumer<String> st = a->{//java 8 feature method calling
		System.out.println(a);
	};st.accept("hello");
}


}
