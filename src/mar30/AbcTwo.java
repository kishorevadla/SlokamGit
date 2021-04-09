package mar30;

public interface AbcTwo {
	int cal(int a);
	
	default void calcu() {
		System.out.println("AbcTwo...cal");
	}
	
	static void calc() {
		System.out.println("ABctwo.....static");
	}

}
