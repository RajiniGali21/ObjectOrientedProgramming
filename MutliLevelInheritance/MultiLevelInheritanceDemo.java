package com.kn.MutliLevelInheritance;

public class MultiLevelInheritanceDemo {

	public static void main(String[] args)
	{
		Vehicle v1 = new Vehicle();
		v1.RegNumber = 2344;
		System.out.println("Registration Number = "+v1.RegNumber);
		v1.move();
		
		
		Car c1 = new Car();
		c1.RegNumber = 8775;
		System.out.println("Registration Number = "+c1.RegNumber);
		c1.move();
		
		Sedan s1 = new Sedan();
		s1.RegNumber = 2344;
		System.out.println("Registration Number = "+s1.RegNumber);
		s1.move();
	
	}

}
