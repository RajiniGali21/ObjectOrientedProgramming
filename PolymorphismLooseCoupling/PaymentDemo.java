package com.kn.PolymorphismLooseCoupling;
//Loose coupling
public class PaymentDemo {

	public static void main(String[] args)
	{
		Payment p = new Payment();
		p.bill();
		p.offer();
		p.pay();
		p = new Upi();
		p.bill();
		p.offer();
		p.pay();
		p = new Wallet();
		p.bill();
		p.offer();
		p.pay();
		
				
			
			
				
	}

}
