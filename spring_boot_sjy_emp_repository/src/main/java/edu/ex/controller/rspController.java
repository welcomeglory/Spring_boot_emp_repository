package edu.ex.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller 
public class rspController {
	
	@RequestMapping("/rsp_game")
	public String game_start(Model model) {
		System.out.println("game_start()..");
		return "/rsp_game";
	}
	

}
