package apr01;

public class Passport {
private Aadhar aadhar;

@Override
public String toString() {
	return "Passport [aadhar=" + aadhar + "]";
}

public Passport(Aadhar aadhar) {
	super();
	this.aadhar = aadhar;
}

public Aadhar getAadhar() {
	return aadhar;
}
}
