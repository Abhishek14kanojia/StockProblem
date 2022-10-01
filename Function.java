
package org.practice;
import java.util.*;

public class Function {
	Scanner sc = new Scanner(System.in);
	List<Portfolio>list = new ArrayList<Portfolio>();
	void Stock() {
		for (int i = 0; i< 10; i++) {
			Portfolio obj = new Portfolio();
			
			obj.setStockName("Iphone");
	
			obj.setSharePrice(50000);
			
			obj.setNumberofShares(5);
			
			double totalValue = obj.getTotalValueofShares()*obj.getSharePrice();
			obj.setTotalValueofShares(totalValue);
			list.add(obj);
			
			
			
		}
	}
	void result  () {
		for (Portfolio i : list) {
			System.out.println(i);
		}
	}
	
	
}
