package apr02;

import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Optional;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Main {
	public static void main(String[] args) {
		List<Employee> empList = EmpUtility.getEmpInfo();
		empList.stream().forEach(e->System.out.println(e));
		
		System.out.println("============Emp Count============");
		System.out.println(empList.stream().count());
		
		System.out.println("+++++++++++++++ Filter Even Emp List++++++++++++++++");
		empList.stream().filter(e->e.getId()%2==0).forEach(e->System.out.println(e));
		
		System.out.println("-----------Filter Odd Emp List--------------");
		empList.stream().filter(e->e.getId()%2==1).forEach(e->System.out.println(e));
		
		System.out.println("~~~~~~~~~~~~~~~~~~~Any Match~~~~~~~~~~~~~~~~~~~~");
		boolean v=empList.stream().anyMatch(er->er.getName().equals("kishore"));
		System.out.println(v);
		
		
		System.out.println("~~~~~~~~~~~~~~~~~~~~~~all match~~~~~~~~~~~~~~~~~~~~~~~");
		System.out.println(empList.stream().allMatch(am->am.getName().startsWith("kis")));
		//System.out.println(empList);
		
		
		System.out.println("****************find Any******************");
		Optional<Employee> emp=empList.stream().findAny();
		if(emp.isPresent()) {
		System.out.println(emp.get().getName());
		}
		
		
		System.out.println("<<<<<<<<<<<<<<<<<Find First>>>>>>>>>>>>>>>>>");
		Optional<Employee> empl=empList.stream().findFirst();
		if(empl.isPresent()) {
			System.out.println(empl.get().getName());
		}
		
		
		System.out.println("################SortByName by using sorted#################");
		empList.stream().sorted((e1,e2)->e1.getName().compareTo(e2.getName())).forEach(sortedemp->System.out.println(sortedemp.getName()));
		
		
	System.out.println("~~~~~~~~~~~~Converting into new List by using collect method~~~~~~~~~~~~~~~~~~~~~");
	empList.stream().filter(p->p.getGender().equals("male")).collect(Collectors.toList()).forEach(empmale->System.out.println(empmale));
	
	
	System.out.println("~~~~~~~~~~~~~~~~~~Converting into female list by using collect method~~~~~~~~~~~~~~~~");
	empList.stream().filter(p->p.getGender().equals("female")).collect(Collectors.toList()).forEach(femaleEmp->System.out.println(femaleEmp));
	
	
	System.out.println("~~~~~~~~~~~~~~~~~applying bonus to the salary using map method~~~~~~~~~~~~~~~~~~~~~~~");
	
	Function<Employee, Employee> empsal = (empbonus->{
		empbonus.setSal(empbonus.getSal()+5000);
		return empbonus;
	});
	empList.stream().map(empsal).collect(Collectors.toList());
	empList.forEach(bon->{System.out.print("Employee name is :"+bon.getName());
	System.out.println("  and the salary with bonus is "+bon.getSal());});
	
	
	
	System.out.println("~~~~~~~~~~~~~~~~~~Applying bonus with percentage~~~~~~~~~~~~~~~~~~~~~~");
	Function<Employee, Employee> perbon = (perbonus ->{
		perbonus.setSal((perbonus.getSal())*(100/15));
		return perbonus;
	});
	empList.stream().map(perbon).collect(Collectors.toList());
	empList.forEach(per->{System.out.println("Employee name is :"+per.getName());
	System.out.println("  and the salary created with bonus is :  "+per.getSal());});
	
	
	System.out.println("~~~~~~~~~~~~~~~~Converting into new String~~~~~~~~~~~~~~~~~~~~~");
	//List<Long> empAccountlist = empList.stream().filter(emfemale->emfemale.getGender().equals("female")).map(empmap->empmap.getSalAccount().get)
	
	
	System.out.println("`````sorting by using the name````````````````");
	empList.stream().sorted((a,b)->a.getAccNumber().getBankName().compareTo(b.getAccNumber().getBankName()))
	.forEach(bankname->System.out.println(bankname.getAccNumber().getBankName()));
	
	
	System.out.println("~~~~~~~~~~~~~~~~~~sorting in rever~~~~~~~~~~~~~~~~~~~~~~~~");
	empList.stream().sorted((a,b)->b.getAccNumber().getBankName().compareTo(a.getAccNumber().getBankName()))
	.forEach(bankname->System.out.println(bankname.getAccNumber().getBankName()));
	
	
	System.out.println("~~~~~~~~~~~~~~~~~~~~sorting by using Integer values~~~~~~~~~~~~~~~~~~~~~~");
	empList.stream().sorted(Comparator.comparingInt(Employee::getId))
	.forEach(empid->System.out.println(empid.getId()));
	
	
	System.out.println("~~~~~~~~~~~~~~~Sorting by using Integer values in reverse order~~~~~~~~~~~~");
	empList.stream().sorted(Comparator.comparingInt(Employee::getId).reversed())
	.forEach(empid->System.out.println(empid.getId()));
	
	
	System.out.println("~~~~~~~sorting based on salary~~~~~~~~~~~~~~~~~");
	empList.stream().sorted(Comparator.comparingDouble(Employee::getSal))
	.forEach(empid->System.out.println(empid.getSal()));
	
	
	System.out.println("~~~~~~~~~~~~emp mobile using map~~~~~~~~~~~~~~~");
	 List<List<Mobile>> mobileone = empList.stream().map(emplistnewone->emplistnewone.getMobNumber())
			 .collect(Collectors.toList());
	 System.out.println(mobileone);
	
	 System.out.println("~~~~~~~emp mobile using flat~~~~~~~~~~~~~~~~");
	 List<Mobile> listmobile=empList.stream().flatMap(emplistlist->emplistlist.getMobNumber().stream())
			 .collect(Collectors.toList());
	 listmobile.forEach(p->System.out.println(p));
	 
System.out.println("~~~~~~~~~~~~~Conversion of List into map~~~~~~~~~~~~~~~~~~~~~~");
Map<Integer, String> empMap=empList.stream().collect(Collectors.toMap(Employee::getId, Employee::getName));
for(Integer empkey:empMap.keySet()) {
	
	System.out.println(empkey);
}
for(Entry<Integer, String> empMapNew: empMap.entrySet()) {
	System.out.println(empMapNew);
}
	}
	
}
