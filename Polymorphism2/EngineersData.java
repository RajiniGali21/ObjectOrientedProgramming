package com.kn.Polymorphism2;

public class EngineersData 
{
public void doActivity(SoftwareEngineer s)
{
	System.out.println("============");
	s.attendMeeting();
	s.writeTestCases();
	if(s instanceof BackendEngineer)
	{
	((BackendEngineer)(s)).doBackendProject();
	}
	if(s instanceof DatabaseEngineer)
	{
		((DatabaseEngineer)(s)).doDataBaseProject();
		((DatabaseEngineer)(s)).learnSql();
	}
	if(s instanceof JavaBackendEngineer)
	{
		((JavaBackendEngineer)(s)).learnJava();
	}
	if(s instanceof PythonBackEndEngineer)
	{
		((PythonBackEndEngineer)(s)).learnPython();
	}
}
}
