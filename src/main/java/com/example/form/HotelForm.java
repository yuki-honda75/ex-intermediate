package com.example.form;

import javax.validation.constraints.Pattern;

import org.hibernate.validator.constraints.Range;

/**
 * 
 * @author hondayuki
 *
 */
public class HotelForm {
	/** 価格 */
	@Range(min = 1, max = 300000, message = "価格は300,000までの値で入力してください")
	@Pattern(regexp = "^[0-9]+$", message = "数字を入力してください")
	private String price;

	public String getPrice() {
		return price;
	}

	public void setPrice(String price) {
		this.price = price;
	}
	
}
