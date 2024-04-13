package com.Spring.Ioc;

public class Bluedart implements Delivery {
	
	Bluedart(){
		System.out.println("Bluedart Constructor is called");
	}
	
	@Override
	public void deliverOrder() {
		System.out.println("Deliver by Bluedart");
		
	}

	@Override
	public void tracOrder() {
		System.out.println("tracOrder by Bluedart");
		
	}

	@Override
	public void orderReturnRequest() {
		System.out.println("orderReturnRequest by Bluedart");
		
	}

}
