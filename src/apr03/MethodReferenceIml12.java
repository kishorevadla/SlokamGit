package apr03;

public class MethodReferenceIml12 {
	/*
	 * public void printGreetOne() { System.out.println("without parameters"); }
	 */
	
	public void printGreet(String one,String two) {
		System.out.println("with parameters");
	}
	public static void printGreetstati(String one1 , String two2) {
		System.out.println("static method calling");
	}
	public MethodReferenceIml12(String one2,String two1) {
		System.out.println("contructor caliing");
	}
	public static void main(String[] args) {
		//MethodReferenceIml12 il = new MethodReferenceIml12();
		
		/*
		 * MethodRefernce interone = il::printGreetOne; interone.greetone();
		 */
		/*
		 * MethodRefernce inter = il::printGreet; inter.greet("hello","slokam");
		 * 
		 * MethodRefernce inter2 = MethodReferenceIml12::printGreetstati;
		 * inter2.greet("good", "morning"); Method
		 */
	
	}
}
