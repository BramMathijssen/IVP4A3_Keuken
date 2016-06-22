package main.java.domain;

import java.sql.Date;


public class Order {
	
	private int orderNo;
	private Date date;
	private boolean billPayed;
	private String orderStatus;
	
	public Order(int orderNo, Date date, boolean billPayed, String orderStatus){
		this.orderNo = orderNo;
		this.date = date;
		this.billPayed = billPayed;
		this.orderStatus = orderStatus;
	}
	
	public int getOrderNo(){
		return orderNo;
	}
	
	public void setOrderNo(int orderNo){
		this.orderNo = orderNo;
	}
	
	public boolean getBillPayed(){
		return billPayed;
	}
	
	public void setBillPayed(boolean billPayed){
		this.billPayed = billPayed;
	}
	
	public String getOrderStatus(){
		return orderStatus;
	}
	
	public void setOrderStatus(String orderStatus){
		this.orderStatus = orderStatus;
	}

}
