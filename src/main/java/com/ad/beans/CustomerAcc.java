package com.ad.beans;

public class CustomerAcc {
	// Creating Fields based on Customer Table in Banking database
		private int acctNo; 
		private String acctType;
		private Float acctBalance;
		private int customerId;
		
		//Default & Full Constructors
		public CustomerAcc() {
			
		}
		public CustomerAcc(int acctNo, String acctType, Float acctBalance, int customerId) {
			super();
			this.acctNo = acctNo;
			this.acctType = acctType;
			this.acctBalance = acctBalance;
			this.customerId = customerId;
		}
		
		// Getter & Setters
		public int getAcctNo() {
			return acctNo;
		}
		public void setAcctNo(int acctNo) {
			this.acctNo = acctNo;
		}
		public String getAcctType() {
			return acctType;
		}
		public void setAcctType(String acctType) {
			this.acctType = acctType;
		}
		public Float getAcctBalance() {
			return acctBalance;
		}
		public void setAcctBalance(Float acctBalance) {
			this.acctBalance = acctBalance;
		}
		public int getCustomerId() {
			return customerId;
		}
		public void setCustomerId(int customerId) {
			this.customerId = customerId;
		}
		@Override
		public String toString() {
			return "CustomerAcc [acctNo=" + acctNo + ", acctType=" + acctType + ", acctBalance=" + acctBalance
					+ ", customerId=" + customerId + "]";
		}
		
				
}
