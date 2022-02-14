package com.example.form;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;



/**
 * 
 * @author hondayuki
 *
 */
public class HotelForm {
	/** 価格 */
	@Pattern(regexp = "^[0-9]|[1-9][0-9]{1,4}|[1-2][0-9]{5}|300000|$", message = "値段は最大300000までの入力にしてください")
	private String price;

	public String getPrice() {
		return price;
	}

	public void setPrice(String price) {
		this.price = price;
	}
	
}
