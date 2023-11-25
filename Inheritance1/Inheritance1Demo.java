package com.kn.Inheritance1;

public class Inheritance1Demo {

	public static void main(String[] args) 
	{
		ChefRobo cr = new ChefRobo();
		cr.name = "Ram";
		cr.type="1.0";
		System.out.println("Name of chefRobo = "+cr.name);
		System.out.println("Type of ChefRobo = "+cr.type);
		cr.walk();
		cr.talk();
		DriverRobo dr = new DriverRobo();
		dr.name = "Rammaya";
		dr.type="2.0";
		System.out.println("Name of DriverRobo = "+dr.name);
		System.out.println("Type of DriverRobo = "+dr.type);
		dr.walk();
		dr.talk();
		TeacherRobo tr = new TeacherRobo();
		tr.name = "Ramu";
		tr.type="3.0";
		System.out.println("Name of TeacherRobo = "+tr.name);
		System.out.println("Type of TeacherRobo = "+tr.type);
		tr.walk();
		tr.talk();
		
				
	}

}
