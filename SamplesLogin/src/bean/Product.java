package bean;

import java.io.Serializable;

public class Product implements Serializable{

	private int id =1;
	private String name ="まぐろ";
	private int price =100;

	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}


}
