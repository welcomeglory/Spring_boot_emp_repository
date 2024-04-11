package edu.ex.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller 
@RequestMapping("/lotto")
public class LottoController {
	
	@GetMapping("/start")
	public String start(Model model) {
		System.out.println("start()..");
		return "/lotto/lotto";
	}
	

}
