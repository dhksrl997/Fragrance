package Fragrance.web.entity;

public class Items {
	private int itemNums;
	private String img;
	private String name;
	private String brand;
	private int size;
	private String sort;
	private String price;
	private String scent;
	private String sex;
	private int maleLike;
	private int femaleLike;
	private String content;
	

	public Items(int itemNums, String img, String name, String brand, int size, String sort, String price, String scent,
			String sex, int maleLike, int femaleLike, String content) {
		super();
		this.itemNums = itemNums;
		this.img = img;
		this.name = name;
		this.brand = brand;
		this.size = size;
		this.sort = sort;
		this.price = price;
		this.scent = scent;
		this.sex = sex;
		this.maleLike = maleLike;
		this.femaleLike = femaleLike;
		this.content = content;
	}

	public String getSex() {
		return sex;
	}

	public void setSex(String sex) {
		this.sex = sex;
	}

	public Items() {
		// TODO Auto-generated constructor stub
	}

	



	public int getItemNums() {
		return itemNums;
	}

	public void setItemNums(int itemNums) {
		this.itemNums = itemNums;
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

	public String getSort() {
		return sort;
	}

	public void setSort(String sort) {
		this.sort = sort;
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

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}
	
	
}
