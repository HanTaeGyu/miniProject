package com.example.demo.service;

import com.example.demo.dto.SportsDTO;
import com.example.demo.entity.Sports;

public interface SportsService {
	int register(SportsDTO dto);
	
	default Sports dtoToEntity(SportsDTO dto) {
		
	}
}
