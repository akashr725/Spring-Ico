package com.Spring.Ioc;

public class Ekart implements Delivery {
	
	@Override
	public void deliverOrder() {
		System.out.println("Deliver by Ekart");
		
	}

	@Override
	public void tracOrder() {
		System.out.println("tracOrder by Ekart");
		
	}

	@Override
	public void orderReturnRequest() {
		System.out.println("orderReturnRequest by Ekart");
		
	}

}
