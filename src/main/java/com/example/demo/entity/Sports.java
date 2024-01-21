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
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Entity
@Table(name="tbl_sports")
@Getter
@Setter
@ToString
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Sports extends BaseEntity{
	
	@Id
	@GeneratedValue(strategy= GenerationType.IDENTITY)
	int no;
	
	@Column(length=50,nullable = false)
	String brandName;
	
	@Column(nullable = false)
	int price;

	@Column(length=200 ,nullable = false)
	String content;
	
	@Column(length=20,nullable = false)
	String color;
	
	
}
