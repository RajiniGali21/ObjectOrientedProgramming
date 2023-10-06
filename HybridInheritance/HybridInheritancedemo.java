package com.kn.HybridInheritance;

public class HybridInheritancedemo {

	public static void main(String[] args) 
	{
	EngineeringStudent e = new EngineeringStudent();
	e.name = "Rajini";
	System.out.println("Name of Engineering student = "+e.name);
	
	MedicalStudent m = new MedicalStudent();
	m.name = "Deepthi";
	System.out.println("Name  of Medical studnet = "+m.name);
	
	JavaTrainer t = new JavaTrainer();
	t.name = "Arun Sir";
	System.out.println("Name of javatrainer = "+t.name);
	
	SqlTrainer s = new SqlTrainer();
	s.name = "Arun Sir";
	System.out.println("Name of sql trainer = "+s.name);
	
			
		
	}

}
