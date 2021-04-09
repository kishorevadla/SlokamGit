package mar30;

public interface AbcOne {
	int cal(int a);
	default void calcu() {
		
		System.out.println("AbcOne...cal()");
		
	}
	static void calc() {
		System.out.println("ABcone.....static");
	}
	

}
