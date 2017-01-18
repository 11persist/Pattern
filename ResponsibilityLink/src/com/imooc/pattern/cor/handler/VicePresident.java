package com.imooc.pattern.cor.handler;
/**
 * ���۸��ܲ�,������׼50%���ڵ��ۿ�
 * @author ll110
 *
 */
public class VicePresident extends PriceHandler {

	@Override
	public void processDiscount(float discount) {
		if(discount <= 0.50){
			System.out.format("%s��׼���ۿ�:%.2f%n",this.getClass().getName(),discount);
		}else{
			successor.processDiscount(discount);
		}
	}

}