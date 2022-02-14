package com.example.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.domain.Hotel;
import com.example.repository.HotelRepository;

/**
 * 
 * @author hondayuki
 *
 */
@Service
public class HotelService {
	@Autowired
	private HotelRepository hotelRepository;
	
	/**
	 * 
	 * @param price 入力した金額
	 * @return ホテル一覧の検索結果
	 */
	public List<Hotel> findByPrice(Integer price) {
		return hotelRepository.findByPrice(price);
	}
}
