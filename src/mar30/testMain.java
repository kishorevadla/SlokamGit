package mar30;

public class testMain implements AbcOne,AbcTwo{
@Override
public int cal(int a) {
	return a+10;
}
	@Override
public void calcu() {
	AbcOne.super.calcu();
}
	public static void main(String[] args) {
		AbcOne abcone = new testMain();
		System.out.println(abcone.cal(10));
		AbcOne.calc();
		AbcTwo.calc();
	}
	
	
}
