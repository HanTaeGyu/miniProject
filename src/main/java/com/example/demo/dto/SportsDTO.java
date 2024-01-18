package com.example.demo.dto;

import java.time.LocalDateTime;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder

public class SportsDTO {

	int no;
	
	String brandName;
	
	int price;
	
	LocalDateTime regDate;
	
	LocalDateTime modDate;
}
