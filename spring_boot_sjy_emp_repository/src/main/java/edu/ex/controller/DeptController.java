package edu.ex.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import edu.ex.service.DeptService;
import edu.ex.vo.DeptVO;

@Controller 
@RequestMapping("/dept")
public class DeptController {
	
	@Autowired
	private DeptService deptService;
	
	@GetMapping("/list")
	public String list(Model model) {
		System.out.println("list()..");
		model.addAttribute("depts",deptService.getList());
	
		return "/dept/list";
	}
	
	@GetMapping("/register")
	public String register(DeptVO deptVO, Model model) {
		System.out.println("register()..");
		model.addAttribute("deptVO",deptVO);
	
		return "/dept/register";
	}
	@GetMapping("/insert")
	public String insert(DeptVO deptVO, Model model) {
		System.out.println("register()..");
		model.addAttribute("deptVO",deptVO);
	
		return "/dept/list";
	}
	
	

}
