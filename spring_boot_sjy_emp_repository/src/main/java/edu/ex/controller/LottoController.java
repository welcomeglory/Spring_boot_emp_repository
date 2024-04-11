package edu.ex.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import edu.ex.service.LottoService;

@Controller 
@RequestMapping("/lotto")
public class LottoController {
	
	@Autowired
	private LottoService lottoService;
	
	@GetMapping("/start")
	public String start(Model model) {
		System.out.println("start()..");
		model.addAttribute("lotto",lottoService.start());
		
		return "/lotto/lotto";
	}
	

}
