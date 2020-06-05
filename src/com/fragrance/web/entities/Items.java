package com.fragrance.web.entities;

public class Items {
	private int itemnums;
	private String img;
	private String name;
	private String brand;
	private int size;
	private String price;
	private String scent;
	private String gender;
	private int maleLike;
	private int femaleLike;
	public Items(int itemnums, String img, String name, String brand, int size, String price, String scent,
			String gender, int maleLike, int femaleLike) {
		super();
		this.itemnums = itemnums;
		this.img = img;
		this.name = name;
		this.brand = brand;
		this.size = size;
		this.price = price;
		this.scent = scent;
		this.gender = gender;
		this.maleLike = maleLike;
		this.femaleLike = femaleLike;
	}
	public int getItemnums() {
		return itemnums;
	}
	public void setItemnums(int itemnums) {
		this.itemnums = itemnums;
	}
	public String getImg() {
		return img;
	}
	public void setImg(String img) {
		this.img = img;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getBrand() {
		return brand;
	}
	public void setBrand(String brand) {
		this.brand = brand;
	}
	public int getSize() {
		return size;
	}
	public void setSize(int size) {
		this.size = size;
	}
	public String getPrice() {
		return price;
	}
	public void setPrice(String price) {
		this.price = price;
	}
	public String getScent() {
		return scent;
	}
	public void setScent(String scent) {
		this.scent = scent;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public int getMaleLike() {
		return maleLike;
	}
	public void setMaleLike(int maleLike) {
		this.maleLike = maleLike;
	}
	public int getFemaleLike() {
		return femaleLike;
	}
	public void setFemaleLike(int femaleLike) {
		this.femaleLike = femaleLike;
	}


}
