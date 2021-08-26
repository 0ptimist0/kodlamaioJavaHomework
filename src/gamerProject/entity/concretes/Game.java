package gamerProject.entity.concretes;

import gamerProject.entity.abstracts.Entity;

public class Game implements Entity {
	private int id;
	private int price;
	private int percentOfDiscount;
	private int discountedPrice;
	private String name;
	private String image;
	private Seller owner;

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public int getPercentOfDiscount() {
		return percentOfDiscount;
	}

	public void setPercentOfDiscount(int percentOfDiscount) {
		this.percentOfDiscount = percentOfDiscount;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getImage() {
		return image;
	}

	public void setImage(String image) {
		this.image = image;
	}

	public Seller getOwner() {
		return owner;
	}

	public void setOwner(Seller owner) {
		this.owner = owner;
	}

	public int getId() {
		return id;
	}

	public int getDiscountedPrice() {
		return discountedPrice;
	}

}
