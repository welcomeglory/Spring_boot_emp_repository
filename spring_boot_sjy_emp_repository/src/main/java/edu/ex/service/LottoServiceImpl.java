package edu.ex.service;

import org.springframework.stereotype.Service;

import edu.ex.vo.LottoVO;

@Service // 비지니스 로직
public class LottoServiceImpl implements LottoService {

	@Override
	public LottoVO start() {
		System.out.println("start()..");
		return new LottoVO();
	}

}
