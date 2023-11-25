package com.kn.PolymorphismDownCasting;
//DownCasting in polymorphism
public class ShapeDemo {

	public static void main(String[] args) 
	{
//		create a object of parent class
		Shape s = new Shape();
//		create object of child class and assign it to parent reference
//		upcasting circle to shape
		s= new Circle();
//		calling method using child reference
		s.draw();   //Inherited Method
		System.out.println("Area of a circle = "+s.calculateArea());//overriden Method
//		child specific methods can't be called using parent reference
//	System.out.println("Perimeter of circle = "+s.calculatePerimeter()));
		
//		downcasting
		System.out.println("Perimeter of a circle = "+((Circle)(s)).calculatePerimeter());

	}

}
