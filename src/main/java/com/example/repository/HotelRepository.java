package com.example.repository;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.jdbc.core.namedparam.MapSqlParameterSource;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.stereotype.Repository;

import com.example.domain.Hotel;

/**
 * 
 * @author pupi_
 *
 */
@Repository
public class HotelRepository {
	private static final RowMapper<Hotel> HOTEL_ROW_MAPPER = new BeanPropertyRowMapper<>(Hotel.class);
	
	@Autowired
	private NamedParameterJdbcTemplate template;
	
	public List<Hotel> findByPrice(Integer price) {
		String sql = "select * from hotels";
		MapSqlParameterSource param = new MapSqlParameterSource();
		if (price != null) {
			sql += " where price <= :price";
			param.addValue("price", price);
		}
		
		List<Hotel> hotelList = template.query(sql, param, HOTEL_ROW_MAPPER);
		return hotelList;
	}
}
