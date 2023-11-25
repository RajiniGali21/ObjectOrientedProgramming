package com.kn.MultiLevelInheritance;

public class MultiLevelInheritanceDemo {

	public static void main(String[] args) 
	{
		Car c = new Car();
		c.regName = "RAjini";
		System.out.println("Name of the company of car = "+c.regName);
		c.move();
		
		Sedan s = new Sedan();
		s.regName="Audi";
		System.out.println("Name of the Company of the sedan = "+s.regName);
		s.move();
	}

}
