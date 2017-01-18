package com.imooc.pattern.cor.manager;

import com.imooc.pattern.cor.handler.PriceHandler;

/**
 * 销售总监,可以批准40%以内的折扣
 * @author ll110
 *
 */
public class Director extends PriceHandler {

	@Override
	public void processDiscount(float discount) {
		if(discount <= 0.40){
			System.out.format("%s批准了折扣:%.2f%n",this.getClass().getName(),discount);
		}else{
			successor.processDiscount(discount);
		}
	}

}