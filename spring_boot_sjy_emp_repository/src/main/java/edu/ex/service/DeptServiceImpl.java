package edu.ex.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import edu.ex.repository.DeptRepository;
import edu.ex.repository.DeptRepositoryImpl;
import edu.ex.vo.DeptVO;

@Service // 비지니스 로직
public class DeptServiceImpl implements DeptService {

	@Autowired
	private DeptRepository deptRepository;// 폴리멀피즘 적용
//	private DeptRepositoryImpl  deptRepositoryImpl;

	@Override
	public List<DeptVO> getList() {
	System.out.println("getList()..");
		return deptRepository.selectList();
	}
	
	@Override
	public void register(DeptVO deptVO) {
	System.out.println("register()..");
		return ;
	}

}
