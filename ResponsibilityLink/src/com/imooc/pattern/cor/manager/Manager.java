package com.imooc.pattern.cor.manager;

import com.imooc.pattern.cor.handler.PriceHandler;

/**
 * ���۾���,������׼30%���ڵ��ۿ�
 * @author ll110
 *
 */
public class Manager extends PriceHandler {

	@Override
	public void processDiscount(float discount) {
		if(discount <= 0.30){
			System.out.format("%s��׼���ۿ�:%.2f%n",this.getClass().getName(),discount);
		}else{
			successor.processDiscount(discount);
		}
	}

}