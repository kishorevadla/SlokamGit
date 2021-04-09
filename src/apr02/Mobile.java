package apr02;

public class Mobile {
	private long mobNumber;
	private String mobNetwork;
	
	public Mobile(long mobNumber, String mobNetwork) {
		super();
		this.mobNumber = mobNumber;
		this.mobNetwork = mobNetwork;
	}
	@Override
	public String toString() {
		return "Mobile [mobNumber=" + mobNumber + ", mobNetwork=" + mobNetwork + "]";
	}
	public long getMobNumber() {
		return mobNumber;
	}
	public String getMobNetwork() {
		return mobNetwork;
	}

}
