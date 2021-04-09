package apr02;

public class Account {
	private long AccNumber;
	private String bankName;
	
	public Account(long accNumber, String bankName) {
		super();
		AccNumber = accNumber;
		this.bankName = bankName;
	}
	@Override
	public String toString() {
		return "Account [AccNumber=" + AccNumber + ", bankName=" + bankName + "]";
	}
	public long getAccNumber() {
		return AccNumber;
	}
	public String getBankName() {
		return bankName;
	}
	

}
