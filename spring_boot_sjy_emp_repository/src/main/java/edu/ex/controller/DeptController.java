package edu.ex.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import edu.ex.service.DeptService;
import edu.ex.vo.DeptVO;

@Controller 
@RequestMapping("/dept")
public class DeptController {
	
	@Autowired
	private DeptService deptService;
	
	@RequestMapping("/list")
	public String list(Model model) {
		System.out.println("list()..");
		model.addAttribute("depts",deptService.getList());
		return "/dept/list";

//		return "/dept/list";
	}
	
	@PostMapping("/register")
	public String insert(DeptVO deptVO) {
		System.out.println("insert()..");
		deptService.register(deptVO);//command객체?
		return "redirect:/dept/list";//redirect: 이렇게 쓴 이유?

	}	
	//insert.jsp페이지를 보는 함수
	@GetMapping("/insert_view")
	public String inser_view() {
		System.out.println("inser_view()..");
		return "/dept/insert";
	}
	@GetMapping("/remove")
	public String delete(int deptno) {
		System.out.println("delete()..");
		deptService.remove(deptno);

		return "redirect:/dept/list";//redirect: 이렇게 쓴 이유?

	}	
	
	
	

}
