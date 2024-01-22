package com.example.demo.service;

import java.util.List;

import com.example.demo.dto.SportsDTO;
import com.example.demo.entity.Sports;

public interface SportsService {
	// 게시물등록
	int register(SportsDTO dto);

	// 게시물 목록
	List<SportsDTO> getList();
	
	//게시물 상세 조회
	SportsDTO read(int no);
	//게시물 수정
	void modify(SportsDTO dto);
	
	int remove(int no);
	

	// dto > 엔티티 변경
	default Sports dtoToEntity(SportsDTO dto) {
		Sports entity = Sports.builder().no(dto.getNo()).brandName(dto.getBrandName()).price(dto.getPrice())
				.content(dto.getContent()).color(dto.getColor()).build();
		return entity;
	}
//엔티티 dto로 변경 메소드
	default SportsDTO entityToDTO(Sports sports) {
		SportsDTO dto = SportsDTO.builder().no(sports.getNo()).brandName(sports.getBrandName()).price(sports.getPrice())
				.content(sports.getContent()).color(sports.getColor()).build();
		return dto;
	}
}
