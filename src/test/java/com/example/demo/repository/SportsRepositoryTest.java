package com.example.demo.repository;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.example.demo.entity.Sports;

@SpringBootTest
public class SportsRepositoryTest {

	@Autowired
	SportsRepository repository;
	
	
	
	@Test
	public void 게시물등록() {
		Sports sports = Sports
				.builder().no(1)
				.brandName("flexbody")
				.price(15000)
				.content("손목스트랩 : 프레스위주사용")
				.color("pink").build();
		repository.save(sports);
		
		
	}
}
