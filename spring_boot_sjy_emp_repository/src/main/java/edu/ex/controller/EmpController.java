package edu.ex.controller;

import java.sql.Timestamp;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import edu.ex.service.DeptService;
import edu.ex.service.EmpService;
import edu.ex.vo.DeptVO;
import edu.ex.vo.EmpVO;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.ResponseBody;
import java.sql.Timestamp;
import java.text.SimpleDateFormat;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.ResponseBody;
import java.sql.Timestamp;
import java.text.SimpleDateFormat;
import java.text.ParseException;

@Controller 
@RequestMapping("/emp")
public class EmpController {
	
	@Autowired
	private EmpService empService;
	
	@RequestMapping("/list")
	public String list(Model model) {
		System.out.println("list()..");
		model.addAttribute("emps",empService.getList());
		return "/emp/list";
	}
	@PostMapping("/register")
	public String register(EmpVO empVO, HttpServletRequest request) {
		empService.register(empVO);
		return "redirect:/emp/list";
		
	}
	

//	@PostMapping("/register")
//	public String insert(HttpServletRequest request) {
//		System.out.println("insert()..");
//		int  empno= Integer.valueOf(request.getParameter("empno"));
//		String ename = request.getParameter("ename");
//		String job = request.getParameter("job");
//		int  mgr= Integer.valueOf(request.getParameter("mgr"));
//		String  hiredate= request.getParameter("hiredate");
//		int sal= Integer.valueOf(request.getParameter("sal"));
//		int comm= Integer.valueOf(request.getParameter("comm"));
//		int deptno= Integer.valueOf(request.getParameter("deptno"));
//		
//		System.out.println(hiredate);
//		//Timestamp.valueOf(hiredate) String 값을 Timestamp로
//		Timestamp date = Timestamp.valueOf(hiredate);	
//		
//		EmpVO empVO =  new EmpVO();	
//		empVO.setEmpno(Integer.valueOf(empno));
//		empVO.setEname(ename);
//		empVO.setJob(job);
//		empVO.setMgr(Integer.valueOf(mgr));
//		empVO.setHiredate(date);
//		empVO.setSal(Integer.valueOf(sal));
//		empVO.setComm(Integer.valueOf(comm));
//		empVO.setDeptno(Integer.valueOf(deptno));
//
//		//empService.register(empVO);
//		return "redirect:/emp/list";
//
//	}	
	//insert.jsp페이지를 보는 함수
	@GetMapping("/insert_view")
	public String inser_view() {
		System.out.println("insert_view()..");
		return "/emp/insert";
	}
	@GetMapping("/remove")
	public String delete(int empno) {
		System.out.println("delete()..");
		empService.remove(empno);

		return "redirect:/emp/list";

	}	
	
	
	

}
