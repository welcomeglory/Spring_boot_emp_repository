package edu.ex.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import edu.ex.mapper.DeptMapper;
import edu.ex.repository.DeptRepository;
import edu.ex.repository.DeptRepositoryImpl;
import edu.ex.vo.DeptVO;
import lombok.extern.slf4j.Slf4j;

@Service // 비지니스 로직
public class DeptServiceImpl implements DeptService {

	@Autowired
	private DeptMapper deptMapper;// 다형성 적용
//	private DeptRepository deptRepository;// 다형성 적용
//	private DeptRepositoryImpl  deptRepositoryImpl;

	@Override
	public List<DeptVO> getList() {
		System.out.println("getList() deptMapper..");
		return deptMapper.selectList();
	}
	//repository에 있는 insert호출
	@Override
	public void register(DeptVO deptVO) {
		System.out.println("register()..");
		deptMapper.insert(deptVO);
		return;
	}
	@Override
	public void remove(int deptno) {
		System.out.println("delete()..");
		deptMapper.delete(deptno);
		return;		
	}

}
