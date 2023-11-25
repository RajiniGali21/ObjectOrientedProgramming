package com.kn.PolymorphismDownCasting;
// Instanceof == is used for testing whether the object is instance of specified type.
public class Geometry 
{
public void doActivity(Shape s)
{
	s.draw();
	System.out.println(s.calculateArea());
	if(s instanceof Circle)
	{
		System.out.println("Perimeter of circle = "+((Circle)(s)).calculatePerimeter());
	}
	
}
}
