package com.hanke.pojo.vo.request;

/**
 * Author: XiaoTaiChen
 * Date: 2023/3/22 14:08
 */
public class OrderVO {
	//消费者名称
	private String consumerUserName;
	//水果名称
	private String fruitName;
	//斤
	private int jin;
	//价格
	private int price;
	//打折
	private double disCount;


	public OrderVO() {
	}

	public OrderVO(String consumerUserName, String fruitName, int jin, int price, double disCount) {
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
