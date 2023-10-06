package com.kn.HierarchyInheritance;

public class HierarchyInheritanceDemo {

	public static void main(String[] args) 
	{
		System.out.println("***********************");
		Employee e1 = new Employee();
		e1.name = "Ajay";
		e1.salary = 10000;
		System.out.println("Name of Employee = "+e1.name);
		System.out.println("Salary of Employee = "+e1.salary);
		
		System.out.println("........................");
		Developer d1 = new Developer();
		d1.name = "Abhi";
		d1.salary = 20000;
		System.out.println("Name of Deve9loper = "+d1.name);
		System.out.println("Salary of Developer = "+d1.salary);
		
		System.out.println("...................");
		TestEnginer e2 = new TestEnginer();
		e2.name = "adhii";
		e2.salary = 765000;
		System.out.println("Name of Testengineer = "+e2.name);
		System.out.println("Salary of TestEnginer = "+e2.salary);
		
		System.out.println("......................");
		Manager m1 = new Manager();
		m1.name = "alli";
		m1.salary = 876000;
		System.out.println("Name of Manager = "+m1.name);
		System.out.println("Salary of Manager = "+m1.salary);
		
		System.out.println("....................");
		TeamLead t2 = new TeamLead();
		t2.name = "ammuu";
		t2.salary = 980000;
		System.out.println("Name of Teamlead = "+t2.name);
		System.out.println("Salary of Teamlead = "+t2.salary);
		System.out.println("****************************");
		
				
	}

}
