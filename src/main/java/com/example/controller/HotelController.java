package com.example.controller;

import java.util.List;

import javax.naming.Binding;
import javax.validation.constraints.Size;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.example.domain.Hotel;
import com.example.form.HotelForm;
import com.example.service.HotelService;

/**
 * 
 * @author hondayuki
 *
 */
@Controller
@RequestMapping("/ex02")
public class HotelController {
	@Autowired
	private HotelService hotelService;
	
	@ModelAttribute
	public HotelForm setUpHotelForm() {
		return new HotelForm();
	}
	
	@RequestMapping("")
	public String index() {
		return "ex02-form";
	}
	
	@RequestMapping("/search")
	public String findByPrice(
			@Validated HotelForm form,
			BindingResult result,
			Model model) {
		if (result.hasErrors()) {
			return index();
		}
		
		Integer price;
		if (form.getPrice() == "") {
			price = null;
		} else {
			price = Integer.parseInt(form.getPrice());
		}
		
		List<Hotel> hotelList = hotelService.findByPrice(price);
		model.addAttribute("hotelList", hotelList);
		
		return index();
	}
}
