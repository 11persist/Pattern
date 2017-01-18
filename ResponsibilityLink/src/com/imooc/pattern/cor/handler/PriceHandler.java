package com.imooc.pattern.cor.handler;
/**
 * �۸�����,�����ͻ��ۿ�����
 * @author ll110
 *
 */
public abstract class PriceHandler {
	/*
	 * ֱ�Ӻ��,���ڴ�������
	 */
	protected PriceHandler successor;

	public void setSuccessor(PriceHandler successor) {
		this.successor = successor;
	}
	/*
	 * �����ۿ�����.
	 */
	public abstract void processDiscount(float discount);
	/**
	 * ��������
	 */
	public static PriceHandler createPriceHandler(){
		PriceHandler sales = new Sales();
		PriceHandler man = new Manager();
		PriceHandler dir = new Director();
		PriceHandler vp = new VicePresident();
		PriceHandler ceo = new CEO();
		
		sales.setSuccessor(man);
		man.setSuccessor(dir);
		dir.setSuccessor(vp);
		vp.setSuccessor(ceo);
		
		return sales;
	}
}