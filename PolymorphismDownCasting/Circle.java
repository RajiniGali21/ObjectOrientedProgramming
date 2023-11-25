package com.kn.PolymorphismDownCasting;

public class Circle extends Shape
{
	double r = 5.5;
//overriden method
	@Override
	public double calculateArea() {
		return Math.PI*r*r;
	}
//	child specific method
	public double calculatePerimeter()
	{
		return 2*Math.PI*r;
	}
	

}
