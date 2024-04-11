package edu.ex.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import edu.ex.service.LottoService;
import edu.ex.service.RspService;
import edu.ex.vo.RspVO;

@Controller 
@RequestMapping("/rsp")
public class RspController {
	
	@Autowired
	private RspService rspService;
	
	@GetMapping("/start")
	public String start(Model model) {
		System.out.println("start()..");
		rspService.start(null, model);
		
		return "/rsp/rsp";
	}
	
	 //http://localhost:8282/rsp/result.do
	   @PostMapping("/result.do")
	   public String result(Model model,@RequestParam String rsp) {
	      
	      rspService.start(rsp, model);
	      
	      return "rsp/rsp";
	   }   

	

}
