package com.example.domain;

/**
 * 
 * @author hondayuki
 *
 */
public class Cloth {
	/** ID */
	private Integer id;
	/** カテゴリー */
	private String category;
	/** ジャンル */
	private String genru;
	/** 性別 */
	private Integer gender;
	/** カラー */
	private String color;
	/** 値段 */
	private Integer price;
	/** サイズ */
	private String size;
	
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getCategory() {
		return category;
	}
	public void setCategory(String category) {
		this.category = category;
	}
	public String getGenru() {
		return genru;
	}
	public void setGenru(String genru) {
		this.genru = genru;
	}
	public Integer getGender() {
		return gender;
	}
	public void setGender(Integer gender) {
		this.gender = gender;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public Integer getPrice() {
		return price;
	}
	public void setPrice(Integer price) {
		this.price = price;
	}
	public String getSize() {
		return size;
	}
	public void setSize(String size) {
		this.size = size;
	}
	@Override
	public String toString() {
		return "Cloth [id=" + id + ", category=" + category
				+ ", genru=" + genru + ", gender=" + gender
				+ ", color=" + color + ", price=" + price
				+ ", size=" + size + "]";
	}
}
