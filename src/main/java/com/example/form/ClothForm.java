package com.example.form;

import javax.validation.constraints.NotEmpty;

/**
 * 
 * @author hondayuki
 *
 */
public class ClothForm {
	/** カラー */
	@NotEmpty(message = "選択してください")
	private String color;
	/** 性別 */
	@NotEmpty(message = "選択してください")
	private String gender;
	
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public String getGender() {
		return gender;
	}
	public Integer getIntGender() {
		return Integer.parseInt(gender);
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	
}
