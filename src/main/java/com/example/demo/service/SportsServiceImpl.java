package com.example.demo.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.dto.SportsDTO;
import com.example.demo.entity.Sports;
import com.example.demo.repository.SportsRepository;

@Service
public class SportsServiceImpl implements SportsService {
	@Autowired
	private SportsRepository repository;

	@Override
	public int register(SportsDTO dto) {
		Sports entity = dtoToEntity(dto);

		repository.save(entity);

		int newNo = entity.getNo();

		System.out.println(newNo);

		return newNo;
	}

	@Override
	public List<SportsDTO> getList() {
		List<Sports> result = repository.findAll();
		List<SportsDTO> list = new ArrayList<>();
		list = result.stream().map(entity -> entityToDTO(entity)).collect(Collectors.toList());
		return list;
	}

	@Override
	public SportsDTO read(int no) {
		Optional<Sports> result = repository.findById(no);
		if (result.isPresent()) {
			Sports sports = result.get();
			SportsDTO dto = entityToDTO(sports);
			return dto;
		}
		return null;
	}

	@Override
	public void modify(SportsDTO dto) {
		Optional<Sports> result = repository.findById(dto.getNo());
		if (result.isPresent()) {
			Sports entity = result.get();
			
			
			entity.setPrice(dto.getPrice());
			entity.setContent(dto.getContent());
			
			repository.save(entity);
		}

	}
	@Override
	public int remove(int no) {
		Optional<Sports>result = repository.findById(no);
		if(result.isPresent()) {
			repository.deleteById(no);
			return 1;
		}else {
		return 0;}
	}
	

}
