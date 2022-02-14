package com.example.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.domain.Team;
import com.example.service.TeamService;

/**
 * 
 * @author hondayuki
 *
 */
@Controller
@RequestMapping("/ex01")
public class TeamController {
	@Autowired
	private TeamService teamService;
	
	@RequestMapping("")
	public String showList(Model model) {
		List<Team> teamList = teamService.showList();
		model.addAttribute("teamList", teamList);
		
		return "ex01";
	}
	
	@RequestMapping("/showDetail")
	public String showDetail(String id, Model model) {
		Team team = teamService.showDetail(Integer.parseInt(id));
		model.addAttribute("team", team);
		
		return "ex01-detail";
	}
}
