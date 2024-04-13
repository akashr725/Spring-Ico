package com.Spring.Ioc;

public class Ecommerce implements Delivery{

	@Override
	public void deliverOrder() {
		System.out.println("Deliver by Ecommerce");
		
	}

	@Override
	public void tracOrder() {
		System.out.println("tracOrder by Ecommerce");
		
	}

	@Override
	public void orderReturnRequest() {
		System.out.println("orderReturnRequest by Ecommerce");
		
	}

}
