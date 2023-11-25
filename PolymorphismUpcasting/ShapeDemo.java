package com.kn.PolymorphismUpcasting;
//upCasting in polymorphism
public class ShapeDemo {

	public static void main(String[] args) 
	{
		Shape s = new Shape();
		Rectangle r = new Rectangle();
		s=r;
		s.draw();
		System.out.println(s.calculateArea());
		Square sq = new Square();
		s=sq;
		s.draw();
		System.out.println(s.calculateArea());
		Circle c = new Circle();
		s = c;
		s.draw();
		System.out.println(s.calculateArea());
	

	}

}
