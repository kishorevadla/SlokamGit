package apr02;

import java.util.List;

public class Employee {
	private int id;
	private String name;
	private String desg;
	private String mail;  
	private String gender;
	private String salAccount;
	private Double sal;
	private Account accNumber;
	private List<Mobile> mobNumber;
	public void setSal(Double sal) {
		this.sal = sal;
	}


	public Employee(int id, String name, String desg, String mail, String gender, Double sal, Account accNumber,
			List<Mobile> mobNumber, String salAccount) {
		super();
		this.id = id;
		this.name = name;
		this.desg = desg;
		this.mail = mail;
		this.gender = gender;
		this.sal = sal;
		this.salAccount=salAccount;
		this.accNumber = accNumber;
		this.mobNumber = mobNumber;
	}
	
	
	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", desg=" + desg + ", mail=" + mail + ", gender=" + gender
				+ ", sal=" + sal + ", accNumber=" + accNumber + ", mobNumber=" + mobNumber +",salAccount="+salAccount+" ]";
	}
	public int getId() {
		return id;
	}
	public String getName() {
		return name;
	}
	public String getDesg() {
		return desg;
	}
	public Account getAccNumber() {
		return accNumber;
	}
	public List<Mobile> getMobNumber() {
		return mobNumber;
	}
	public String getMail() {
		return mail;
	}
	public String getGender() {
		return gender;
	}
	public Double getSal() {
		return sal;
	}


	public String getSalAccount() {
		return salAccount;
	}

}
