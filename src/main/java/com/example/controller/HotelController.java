package com.example.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.domain.Hotel;
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
	
	@RequestMapping("")
	public String index() {
		return "ex02-form";
	}
	
	@RequestMapping("/search")
	public String findByPrice(Integer price, Model model) {
		List<Hotel> hotelList = hotelService.findByPrice(price);
		model.addAttribute("hotelList", hotelList);
		
		return index();
	}
}
