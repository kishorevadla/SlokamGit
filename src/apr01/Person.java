package apr01;

public class Person {
	private Passport passport;

	@Override
	public String toString() {
		return "Person [passport=" + passport + "]";
	}

	public Person(Passport passport) {
		super();
		this.passport = passport;
	}

	public Passport getPp() {
		return passport;
	}

}
