
package org.practice;
import java.util.*;

public class Function {
	long accountBalance = 0;
	Scanner sc = new Scanner(System.in);
	List<Portfolio>list = new ArrayList<Portfolio>();
	void Stock() {
		for (int i = 0; i < 5; i++) {
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
	void credit() {
		int amount = 150000;
		accountBalance = accountBalance + amount;
		System.out.println(accountBalance);
	}
	void debit() {
		long debitAmount = 120000;
		if (debitAmount>accountBalance) {
			System.out.println("debit amount is greater then accout balance");
			
		}else {
			long remainingammount = accountBalance - debitAmount;
			System.out.println(remainingammount);
		}
	}
}
