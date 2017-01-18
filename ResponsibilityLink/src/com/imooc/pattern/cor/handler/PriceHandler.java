package com.imooc.pattern.cor.handler;
/**
 * 价格处理人,处理客户折扣申请
 * @author ll110
 *
 */
public abstract class PriceHandler {
	/*
	 * 直接后继,用于传递请求
	 */
	protected PriceHandler successor;

	public void setSuccessor(PriceHandler successor) {
		this.successor = successor;
	}
	/*
	 * 处理折扣请求.
	 */
	public abstract void processDiscount(float discount);
	/**
	 * 工厂方法
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
