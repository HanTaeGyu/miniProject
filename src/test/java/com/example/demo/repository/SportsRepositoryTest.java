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
		Sports sports = new Sports();
		
	}
}
