package com.kn.HybridInheritance;

public class HybridInheritanceDemo {

	public static void main(String[] args) 
	{
		EngineringStudent es = new EngineringStudent();
		es.name="Ranjith";
		System.out.println("NAme of engineeringstudent = "+es.name);
		
		
		MedicalStudent ms = new MedicalStudent();
		ms.name="Deepthi";
		System.out.println("NAme of MedicalStudent = "+ms.name);
		
		JavaTrainer tt = new JavaTrainer();
		tt.name="Arun";
		System.out.println("NAme of JAvaTrainer = "+tt.name);
		
		SqlTrainer st = new SqlTrainer();
		st.name="Aruna";
		System.out.println("NAme of SqlTrainer = "+st.name);
		
		
		
	}

}
