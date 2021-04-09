package apr03;

public class People {
	private int id;
	private String name;
	private int age;
	private String caste;
	private String address;
	public int getId() {
		return id;
	}
	public String getName() {
		return name;
	}
	public int getAge() {
		return age;
	}
	public String getCaste() {
		return caste;
	}
	public String getAddress() {
		return address;
	}
	@Override
	public String toString() {
		return "People [id=" + id + ", name=" + name + ", age=" + age + ", caste=" + caste + ", address=" + address
				+ "]";
	}
	public People(int id, String name, int age, String caste, String address) {
		super();
		this.id = id;
		this.name = name;
		this.age = age;
		this.caste = caste;
		this.address = address;
	}
	

}
