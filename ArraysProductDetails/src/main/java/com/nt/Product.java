package com.nt;

public class Product {
	public String name;
	public String code;
	public Float price;
	public Integer qty;

	public Product(String name, String code, Float price, Integer qty) {
		super();
		this.name = name;
		this.code = code;
		this.price = price;
		this.qty = qty;
	}

	@Override
	public String toString() {
		return "Product [name=" + name + ", code=" + code + "," + " price=" + price + ", qty=" + qty + "]";
	}

}
