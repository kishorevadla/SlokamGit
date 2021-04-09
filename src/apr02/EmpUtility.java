package apr02;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import apr03.People;

public interface EmpUtility {
	static List<Employee> getEmpInfo(){
		List<Mobile> mobList=Arrays.asList(new Mobile(8125734954L, "idea"));
		List<Employee> empList = Arrays.asList(new Employee(1, "kishore", "SE", "kishore@gmail.com", "male", 5000.10, new Account(1111258746, "ICICI"), mobList, "salAccount"),
				new Employee(2, "mahesh", "SE", "mahesh@gmail.com", "male", 4000.12, new Account(22224156845L, "axis"),Arrays.asList(new Mobile(9848638796L, "idea")), "salAccount"),
				new Employee(3, "alekhya", "HE", "alekhya@gmail.com", "female", 3000.50, new Account(333315478554L, "SBI"),Arrays.asList(new Mobile(564745484L, "idea")), "salAccount" ),
				new Employee(4, "taruni", "HE", "taruni@gmail.com", "female", 8000.50, new Account(443315478554L, "RBI"),Arrays.asList(new Mobile(485745484L, "docomo")), "salAccount" ),
				new Employee(5, "kaustubha", "HE", "kaustubha@gmail.com", "female", 6000.50, new Account(553315478554L, "UBL"),Arrays.asList(new Mobile(785745484L, "idea")), "salAccount" ));
		return empList;
	}
/*
 * static List<People> getPeopleInfo(){
 * 
 * } 
 */
}