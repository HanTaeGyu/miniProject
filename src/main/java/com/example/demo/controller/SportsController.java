package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.example.demo.dto.SportsDTO;
import com.example.demo.service.SportsService;

@Controller
@RequestMapping("/sports")
public class SportsController {

	@Autowired
	SportsService service;

	@GetMapping("/main")
	public void main() {

	}

	@GetMapping("/list")
	public void list(Model model) {
		List<SportsDTO> list = service.getList();
		model.addAttribute("list", list);
	}

	@GetMapping("/register")
	public void register() {

	}

	@PostMapping("/register")
	public String registerPost(SportsDTO dto, RedirectAttributes redirectAttributes) {

		int no = service.register(dto);

		redirectAttributes.addFlashAttribute("msg", no);

		return "redirect:/sports/list";
	}

	@GetMapping("/read")
	public void read(@RequestParam(name = "no") int no, Model model) {
		SportsDTO dto = service.read(no);
		model.addAttribute("dto", dto);
	}

	@GetMapping("/modify")
	public void modify(@RequestParam(name = "no") int no, Model model) {
		SportsDTO dto = service.read(no);
		model.addAttribute("dto",dto);
	}
	
	@PostMapping("/modify")
	public String modifyPost(SportsDTO dto,RedirectAttributes redirectAttributes) {
		service.modify(dto);
		redirectAttributes.addFlashAttribute("no",dto.getNo());
		return "redirect:/sports/read";
	}
	@PostMapping("/remove")
	public String removePost(@RequestParam(name="no")int no) {
		service.remove(no);
		return "redirect:/sports/list";
	}
	

	}
	
	
	

