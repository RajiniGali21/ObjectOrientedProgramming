package com.kn.Inheritance2;

public class InheritanceDemo {

	public static void main(String[] args) 
	{
		ChefRobo c1 = new ChefRobo();
		c1.name= "Rajini";
		c1.type = 2.0;
		System.out.println("Name = "+c1.name);
		System.out.println("type = "+c1.type);
		c1.walk();
		c1.talk();
		c1.charge();
		c1.cook();
		System.out.println(".....................");
		DriverRobo c2 = new DriverRobo();
		System.out.println("Name = "+c2.name);
		System.out.println("type = "+c2.type);
		c2.walk();
		c2.talk();
		c2.charge();
		c2.driver();
		System.out.println(".....................");
		TeacherRobo c3 = new TeacherRobo();
		c3.name = "RRR";
		c3.type = 3.0;
		System.out.println("Name = "+c3.name);
		System.out.println("type = "+c3.type);
		c3.walk();
		c3.talk();
		c3.charge();
		c3.teach();
	}

}
