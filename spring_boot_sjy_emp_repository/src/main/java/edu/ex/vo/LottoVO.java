package edu.ex.vo;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class LottoVO {
	private final static int LOTTO_COUNT = 7;
	private Set<Integer> numbers = new HashSet<Integer>();
	
	private List<Integer> arrList = new ArrayList<Integer>();
	private int bonusNum;
	
	public List<Integer> getArrList() {
		return arrList;
	}

	public void setArrList(List<Integer> arrList) {
		this.arrList = arrList;
	}
	
	public int getBonusNum() {
		return bonusNum;
	}

	public void setBonusNum(int bonusNum) {
		this.bonusNum = bonusNum;
	}

	public LottoVO() {
		while(numbers.size() < LOTTO_COUNT) {
			numbers.add( (int) (Math.random() *45) +1);			
		}
		
		List<Integer> lottoList = new ArrayList<>(numbers);
		
		for(int i=0; i < lottoList.size() -1; i++ ) {
			int num = lottoList.get(i);
			arrList.add(num);
		}
		
		bonusNum = lottoList.get(lottoList.size() -1);
		
		
		System.out.println(numbers);
	}
	
	public String getBackground(int num) {
		String color="black";
		
		if(num > 0 && num <= 10) {
			color = "gold";
		}else{
			color ="black";
		}
		return color;		
	}
	
	public Set<Integer> getNumbers() {
		return numbers;
	}

	public void setNumbers(Set<Integer> numbers) {
		this.numbers = numbers;
	}	
}
