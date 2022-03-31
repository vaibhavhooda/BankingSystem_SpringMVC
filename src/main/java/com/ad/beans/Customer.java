package com.ad.beans;

public class Customer {
	// Creating Fields based on Customer Table in Banking database
		private int customerId; 
		private String name;
		private String country;
		private String state;
		private String postalcode;
		private String addr;
		private int userId;
		
		public Customer() {
			
		}
		
		public Customer(int customerId, String name, String country, String state, String postalcode, String addr,
				int userId) {
			
			this.customerId = customerId;
			this.name = name;
			this.country = country;
			this.state = state;
			this.postalcode = postalcode;
			this.addr = addr;
			this.userId = userId;
		}
		public int getCustomerId() {
			return customerId;
		}
		public void setCustomerId(int customerId) {
			this.customerId = customerId;
		}
		public String getName() {
			return name;
		}
		public void setName(String name) {
			this.name = name;
		}
		public String getCountry() {
			return country;
		}
		public void setCountry(String country) {
			this.country = country;
		}
		public String getState() {
			return state;
		}
		public void setState(String state) {
			this.state = state;
		}
		public String getPostalcode() {
			return postalcode;
		}
		public void setPostalcode(String postalcode) {
			this.postalcode = postalcode;
		}
		public String getAddr() {
			return addr;
		}
		public void setAddr(String addr) {
			this.addr = addr;
		}
		public int getUserId() {
			return userId;
		}
		public void setUserId(int userId) {
			this.userId = userId;
		}
		@Override
		public String toString() {
			return "Customer [customerId=" + customerId + ", name=" + name + ", country=" + country + ", state=" + state
					+ ", postalcode=" + postalcode + ", addr=" + addr + ", userId=" + userId + "]";
		}

}
