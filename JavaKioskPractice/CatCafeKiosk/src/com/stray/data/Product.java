package com.stray.data;
public class Product {
	public String name;
	public int price;
	
	public Product(String x, int y){
		name = x;
		price = y;
	}
	
	public void info() {
		System.out.println(String.format("상품명 : [%5s] 가격 : [%5d 원]", name, price));
	}
	
}