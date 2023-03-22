package com.hanke.pojo.po;

/**
 * Author: XiaoTaiChen
 * Date: 2023/3/22 14:08
 */
public class OrderPO {
	private String consumerUserName;
	private String fruitName;
	private int jin;
	private int price;
	private double disCount;


	public OrderPO() {
	}

	public OrderPO(String consumerUserName, String fruitName, int jin, int price, double disCount) {
		this.consumerUserName = consumerUserName;
		this.fruitName = fruitName;
		this.jin = jin;
		this.price = price;
		this.disCount = disCount;
	}

	public double getDisCount() {
		return disCount;
	}

	public void setDisCount(double disCount) {
		this.disCount = disCount;
	}

	public String getConsumerUserName() {
		return consumerUserName;
	}

	public void setConsumerUserName(String consumerUserName) {
		this.consumerUserName = consumerUserName;
	}

	public String getFruitName() {
		return fruitName;
	}

	public void setFruitName(String fruitName) {
		this.fruitName = fruitName;
	}

	public int getJin() {
		return jin;
	}

	public void setJin(int jin) {
		this.jin = jin;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}
}
