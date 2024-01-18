package com.example.demo.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name="tbl_sports")
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class Sports {
	
	@Id
	@GeneratedValue(strategy= GenerationType.IDENTITY)
	int no;
	
	@Column(length=50,nullable = false)
	String brandName;
	@Column(nullable = false)
	int price;
	
}
