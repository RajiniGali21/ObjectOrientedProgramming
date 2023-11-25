package com.kn.Polymorphism2;

public class PolymorphismDemo {

	public static void main(String[] args)
	{
		SoftwareEngineer se = new SoftwareEngineer();
		BackendEngineer be = new BackendEngineer();
		DatabaseEngineer db = new DatabaseEngineer();
		JavaBackendEngineer jb = new JavaBackendEngineer();
		PythonBackEndEngineer pb = new PythonBackEndEngineer();
		
		
		EngineersData ed = new EngineersData();
		ed.doActivity(se);
		ed.doActivity(be);
		ed.doActivity(db);
		ed.doActivity(jb);
		ed.doActivity(pb);
	}

}
