package com.kn.PolymorphismUpcasting;

public class Square extends Shape 
{
public void draw()
{
	System.out.println("drawing square");
}
public double calculateArea()
{
	double side=5.5;
	return side*side;
}
}
