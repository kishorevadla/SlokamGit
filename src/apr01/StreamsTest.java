package apr01;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class StreamsTest {
	public static void main(String[] args) {  //general process
		
	
	Aadhar a1 = new Aadhar(123456789);
	Passport p1 = new Passport(a1);
	Person per1 = new Person(p1);
	
	Aadhar a2 = new Aadhar(234589);
	Passport p2 = new Passport(a2);
	Person per2 = new Person(p2);
	
	Aadhar a3 = new Aadhar(1234567);
	Passport p3 = new Passport(a3);
	Person per3 = new Person(p3);
	
	//System.out.println(new Person(p1).getPp().getAadhar().getAddNumber());
	//System.out.println(new Person(p2).getPp().getAadhar().getAddNumber());
	//System.out.println(new Person(p3).getPp().getAadhar().getAddNumber());
	
	List<Person> perlist = new ArrayList<Person>();
	perlist.add(per1);
	perlist.add(per2);
	perlist.add(per3);
	
	List<Person> perlist2 = new ArrayList<Person>();
	perlist2.add(new Person(new Passport(new Aadhar(8125734))));
	perlist2.add(new Person(new Passport(new Aadhar(45678))));
	perlist2.add(new Person(new Passport(new Aadhar(1247895))));
	
	Stream<Person> perStream =perlist2.stream();
	for (Person person : perlist2) {
		System.out.println(person.getPp().getAadhar().getAddNumber());
		
	}
	
	
	
	}
}
