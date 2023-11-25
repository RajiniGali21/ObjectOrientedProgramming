package com.kn.PolymorphismUpcasting;

public class Rectangle extends Shape 
{
public void draw()
{
	System.out.println("drawing rectangle");
}
public double calculateArea()
{
	double l=5.5,b=1.5;
	return l*b;
}
}
