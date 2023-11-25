package com.kn.PolymorphismUpcasting;
//Pass by Reference
public class ShapeDemo1 {

	public static void main(String[] args) 
	{
		Rectangle r = new Rectangle();
		Square sq = new Square();
		Circle c = new Circle();
		Geometry g = new Geometry();
		g.doActivity(r);
//		r.draw();
		System.out.println(r.calculateArea());
		g.doActivity(sq);
//		sq.draw();
		System.out.println(sq.calculateArea());
		g.doActivity(c);
//		c.draw();
		System.out.println(c.calculateArea());
	}

}
