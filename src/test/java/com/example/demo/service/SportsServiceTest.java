package com.example.demo.service;

import java.util.List;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.example.demo.dto.SportsDTO;

@SpringBootTest
public class SportsServiceTest {

	@Autowired
	SportsService service;
	
	@Test
	void 게시물등록() {
		SportsDTO dto = SportsDTO.builder()
				.brandName("플렉스바디")
				.price(12900)
				.content("벨트: 허리부상방지 및 중량 증가")
				.color("white").build();
		int no = service.register(dto);
		System.out.println("새로운게시물" + no);
	}
	
	@Test
	void 목록조회() {
		List<SportsDTO>list =  service.getList();
		for(SportsDTO dto : list) {
			System.out.println(dto);
		}
	}
	@Test
	void 수정() {
		SportsDTO dto = service.read(1);
		dto.setPrice(8000);
		dto.setContent("스트랩 : 로우운동 종류 및 턱걸이 보조");
		service.modify(dto);
	}
}
