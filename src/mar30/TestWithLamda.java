package mar30;

public class TestWithLamda {
	public static void main(String[] args) {
		AbcTwo one=(a)->{
			return a*10;
		};
		System.out.println(one.cal(15));
		one.calcu();
		AbcTwo.calc();
	}

}
