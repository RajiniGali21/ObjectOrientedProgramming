package com.kn.Encapsulation;

import java.util.Scanner;

public class ClassRoomApp {

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the temperature = ");
		int temperature = sc.nextInt();
		ClassRoom c = new ClassRoom();
		System.out.println("Temperature = "+c.getTemperature());
		c.setTemperature(temperature);
		System.out.println("temperature = "+c.getTemperature());
		sc.close();
	}

}
