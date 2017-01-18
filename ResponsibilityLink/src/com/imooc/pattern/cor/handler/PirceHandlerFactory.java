package com.imooc.pattern.cor.handler;

import com.imooc.pattern.cor.manager.CEO;
import com.imooc.pattern.cor.manager.Director;
import com.imooc.pattern.cor.manager.Manager;
import com.imooc.pattern.cor.manager.Sales;
import com.imooc.pattern.cor.manager.VicePresident;

public class PirceHandlerFactory {

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
