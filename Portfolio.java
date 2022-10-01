package org.practice;

public class Portfolio {

		private String stockName;
		private int numberofShares;
		private double sharePrice;
		private double totalValueofShares;
		public String getStockName() {
			return stockName;
		}
		public void setStockName(String stockName) {
			this.stockName = stockName;
		}
		public int getNumberofShares() {
			return numberofShares;
		}
		public void setNumberofShares(int numberofShares) {
			this.numberofShares = numberofShares;
		}
		public double getSharePrice() {
			return sharePrice;
		}
		public void setSharePrice(double sharePrice) {
			this.sharePrice = sharePrice;
		}
		public double getTotalValueofShares() {
			return totalValueofShares;
		}
		public void setTotalValueofShares(double totalValueofShares) {
			this.totalValueofShares = totalValueofShares;
		}
		@Override
		public String toString() {
			return "Portfolio [stockName=" + stockName + ", numberofShares=" + numberofShares + ", sharePrice="
					+ sharePrice + ", totalValueofShares=" + totalValueofShares + "]";
		}
		
		
	
	
	
	
}
