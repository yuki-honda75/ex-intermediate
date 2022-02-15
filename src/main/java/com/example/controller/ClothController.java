package com.example.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.domain.Cloth;
import com.example.form.ClothForm;
import com.example.service.ClothService;

/**
 * 
 * @author hondayuki
 *
 */
@Controller
@RequestMapping("/ex03")
public class ClothController {
	@Autowired
	private ClothService clothService;
	
	@ModelAttribute
	public ClothForm setUpClothForm() {
		return new ClothForm();
	}
	
	@RequestMapping("")
	public String index() {
		return "ex03-form";
	}
	
	@RequestMapping("/search")
	public String search(
			@Validated ClothForm form,
			BindingResult result,
			Model model) {
		if (result.hasErrors()) {
			return index();
		}
		List<Cloth> clothList = clothService.findByColorAndGender(form.getColor(), form.getIntGender());
		
		model.addAttribute("clothList", clothList);
		return index();
	}
}
