package com.imooc.pattern.cor.manager;

import com.imooc.pattern.cor.handler.PriceHandler;

/**
 * ���۸��ܲ�,������׼55%���ڵ��ۿ�,������ܾ�.
 * @author ll110
 *
 */
public class CEO extends PriceHandler {

	@Override
	public void processDiscount(float discount) {
		if(discount <= 0.55){
			System.out.format("%s��׼���ۿ�:%.2f%n",this.getClass().getName(),discount);
		}else{
			System.out.format("%s�ܾ����ۿ�:%.2f%n",this.getClass().getName(),discount);
		}
	}

}