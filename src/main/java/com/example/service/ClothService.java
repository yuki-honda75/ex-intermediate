package com.example.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.domain.Cloth;
import com.example.repository.ClothRepository;

/**
 * 
 * @author hondayuki
 *
 */
@Service
public class ClothService {
	@Autowired
	private ClothRepository clothRepository;
	/**
	 * 
	 * @param color 色
	 * @param gender 性別
	 * @return 衣類のリスト
	 */
	public List<Cloth> findByColorAndGender(String color, Integer gender) {
		return clothRepository.findByColorAndGender(color, gender);
	}
}
