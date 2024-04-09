package edu.ex.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import edu.ex.repository.DeptRepository;
import edu.ex.repository.DeptRepositoryImpl;
import edu.ex.repository.EmpRepository;
import edu.ex.vo.DeptVO;
import edu.ex.vo.EmpVO;

@Service // 비지니스 로직
public class EmpServiceImpl implements EmpService {

	@Autowired
	private EmpRepository empRepository;// 다형성 적용
//	private DeptRepositoryImpl  deptRepositoryImpl;

	@Override
	public List<EmpVO> getList() {
		System.out.println("getList()..");
		return empRepository.selectList();
	}
//	//repository에 있는 insert호출
//	@Override
//	public void register(DeptVO deptVO) {
//		System.out.println("register()..");
//		deptRepository.insert(deptVO);
//		return;
//	}
//	@Override
//	public void remove(int deptno) {
//		System.out.println("delete()..");
//		deptRepository.delete(deptno);
//		return;
//		
//	}

}
