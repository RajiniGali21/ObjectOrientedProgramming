package com.kn.Encapsulation;

import java.util.Scanner;

public class ClassRoomApp {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("ENter the temperature = ");
		int n = sc.nextInt();
		ClassRoom c1 = new ClassRoom();
//	System.out.println("Temperature = "+c1.temperature);
//	c1.temperature = 100;
//	System.out.println("Modified Temperature = "+c1.temperature);
//		
		System.out.println("Temperature = "+c1.getTemperature());
		c1.setTemperature(n);
		System.out.println("Modified Temperature = "+c1.getTemperature());
		sc.close();
		}
}
