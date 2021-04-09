package mar31;

import java.util.function.Supplier;

public class SupplierImpl implements Supplier<String>{

	@Override
	public String get() {
		return "teja";
	}
	public static void main(String[] args) {
		Supplier s = new SupplierImpl();
		System.out.println(s.get());
		 Supplier<String>ss=()->{return "king";};
	System.out.println(ss.get());
	}
	
	

}
