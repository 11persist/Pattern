package com.imooc.pattern.cor.customer;

import java.util.Random;

import com.imooc.pattern.cor.handler.PirceHandlerFactory;
import com.imooc.pattern.cor.handler.PriceHandler;

/**
 * øÕªß,«Î«Û’€ø€
 * @author ll110
 *
 */
public class Customer {
	
	private PriceHandler priceHandler;

	public void setPriceHandler(PriceHandler priceHandler) {
		this.priceHandler = priceHandler;
	}
	
	public void requestDiscount(float discount){
		priceHandler.processDiscount(discount);
	}
	
	public static void main(String[] args) {
		Customer customer = new Customer();
		customer.setPriceHandler(PirceHandlerFactory.createPriceHandler());
		
		Random rand = new Random();
		
		for(int i=1;i<100;i++){
			System.out.print(i+":");
			customer.requestDiscount(rand.nextFloat());
		}
	}
}
