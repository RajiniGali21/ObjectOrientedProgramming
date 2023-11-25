package com.kn.HierarchyInheritance;

public class HierarchyDemo {

	public static void main(String[] args)
	{
		Developer d = new Developer();
		d.name="AAA";
		d.salary="10000";
		System.out.println("Name of developer = "+d.name);
		System.out.println("Salary  of developer= "+d.salary);
		
		

		TestEnginer t = new TestEnginer();
		t.name="BBB";
		t.salary="20000";
		System.out.println("Name of testenginer= "+t.name);
		System.out.println("Salary of testenginer= "+t.salary);
		

		Manager m = new Manager();
		m.name="CCC";
		m.salary="30000";
		System.out.println("Name of manager= "+m.name);
		System.out.println("Salary of manager= "+m.salary);
		

		TeamLead t1 = new TeamLead();
		t1.name="DDD";
		t1.salary="40000";
		System.out.println("Name of teamlead= "+t1.name);
		System.out.println("Salary of teamlead= "+t1.salary);
		
		
	}

}
