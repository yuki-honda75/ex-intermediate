package com.example.repository;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.jdbc.core.namedparam.MapSqlParameterSource;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.stereotype.Repository;

import com.example.domain.Cloth;

/**
 * 
 * @author hondayuki
 *
 */
@Repository
public class ClothRepository {
	private static final RowMapper<Cloth> CLOTH_ROW_MAPPER = new BeanPropertyRowMapper<>(Cloth.class);
	
	@Autowired
	private NamedParameterJdbcTemplate template;
	
	public List<Cloth> findByColorAndGender(String color, Integer gender) {
		String sql = "select * from clothes where 1 = 1";
		MapSqlParameterSource param = new MapSqlParameterSource();
		if (color != null) {
			sql += " and color = :color";
			param.addValue("color", color);
		}
		if (gender != null) {
			sql += " and gender = :gender";
			param.addValue("gender", gender);
		}
		sql += " order by price desc";
		
		List<Cloth> clothList = template.query(sql, param, CLOTH_ROW_MAPPER);
		return clothList;
	}
}
