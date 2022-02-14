package com.example.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.domain.Team;
import com.example.repository.TeamRepository;

/**
 * 
 * @author hondayuki
 *
 */
@Service
public class TeamService {
	@Autowired
	private TeamRepository teamRepository;
	
	public List<Team> showList() {
		return teamRepository.showList();
	}
	
	public Team showDetail(Integer id) {
		return teamRepository.showDetail(id);
	}
}
